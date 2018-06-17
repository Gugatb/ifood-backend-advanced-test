package com.ifood.Playlist.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifood.Playlist.api.OpenWeatherMap;
import com.ifood.Playlist.api.Spotify;
import com.ifood.Playlist.constant.Message;
import com.ifood.Playlist.entity.Playlist;
import com.ifood.Playlist.entity.Recommendation;
import com.ifood.Playlist.entity.Track;
import com.ifood.Playlist.exception.CityNotFoundException;
import com.ifood.Playlist.exception.OpenWeatherMapUnavailableException;
import com.ifood.Playlist.exception.SpotifyUnavailableException;
import com.wrapper.spotify.exceptions.WebApiException;

@Service("recommendation")
public class RecommendationService {
	@Autowired
	private OpenWeatherMap openWeatherMap;
	
	@Autowired
	private Spotify spotify;
	
	/**
	 * Obter a lista de reprodução.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pParam1 o parâmetro
	 * @param pParam2 o parâmetro
	 * @param pType o tipo
	 * @return playlist a lista de reprodução
	 */
	public Playlist getPlaylist(String pParam1, String pParam2, int pType) {
		Recommendation recommendation = new Recommendation();
		
		try {
			if (pType == 0) {
				recommendation.getLocation().setCityName(pParam1 != null ? pParam1 : "");
				recommendation.getLocation().setCountryCode(pParam2 != null ? pParam2 : "");
				recommendation.getTemperature().setValue(
					openWeatherMap.getTemperature(pParam1, pParam2)
				);
			}
			else if (pType == 1) {
				float latitude = Float.valueOf(pParam1);
				float longitude = Float.valueOf(pParam2);
				recommendation.getLocation().setCoordinate(latitude, longitude);
				recommendation.getTemperature().setValue(
					openWeatherMap.getTemperature(latitude, longitude)
				);
			}
		}
		catch (CityNotFoundException exception) {
			throw new CityNotFoundException(
				Message.CITY_NOT_FOUND.getValue()
			);
		}
		catch (NullPointerException | NumberFormatException exception) {
			throw new NumberFormatException();
		}
		catch (IOException exception) {
			throw new OpenWeatherMapUnavailableException(
				Message.OPEN_WEATHER_MAP_UNAVAILABLE.getValue()
			);
		}
		
		// Definir a categoria.
		recommendation.getPlaylist().setCategory(
			spotify.getCategory(
				recommendation.getTemperature().getValue()
			).getName()
		);
		
		// Definir as faixas.
		recommendation.getPlaylist().setTracks(
			getTracks(recommendation.getPlaylist().getCategory())
		);
		return recommendation.getPlaylist();
	}
	
	/**
	 * Obter a recomendação.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pParam1 o parâmetro
	 * @param pParam2 o parâmetro
	 * @param pType o tipo
	 * @return recommendation a recomendação
	 */
	public Recommendation getRecommendation(String pParam1, String pParam2, int pType) {
		Recommendation recommendation = new Recommendation();
		
		try {
			if (pType == 0) {
				recommendation.getLocation().setCityName(pParam1 != null ? pParam1 : "");
				recommendation.getLocation().setCountryCode(pParam2 != null ? pParam2 : "");
				recommendation.getTemperature().setValue(
					openWeatherMap.getTemperature(pParam1, pParam2)
				);
			}
			else if (pType == 1) {
				float latitude = Float.valueOf(pParam1);
				float longitude = Float.valueOf(pParam2);
				recommendation.getLocation().setCoordinate(latitude, longitude);
				recommendation.getTemperature().setValue(
					openWeatherMap.getTemperature(latitude, longitude)
				);
			}
		}
		catch (CityNotFoundException exception) {
			throw new CityNotFoundException(
				Message.CITY_NOT_FOUND.getValue()
			);
		}
		catch (NullPointerException | NumberFormatException exception) {
			throw new NumberFormatException();
		}
		catch (IOException exception) {
			throw new OpenWeatherMapUnavailableException(
				Message.OPEN_WEATHER_MAP_UNAVAILABLE.getValue()
			);
		}
		
		// Definir a categoria.
		recommendation.getPlaylist().setCategory(
			spotify.getCategory(
				recommendation.getTemperature().getValue()
			).getName()
		);
		
		// Definir as faixas.
		recommendation.getPlaylist().setTracks(
			getTracks(recommendation.getPlaylist().getCategory())
		);
		return recommendation;
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pCategory a categoria
	 * @return tracks as faixas
	 */
	private List<Track> getTracks(String pCategory) {
		try {
			// Conectar no Spotify.
			spotify.connect();
		}
		catch (IOException | WebApiException e) {
			throw new SpotifyUnavailableException(
				Message.SPOTIFY_UNAVAILABLE.getValue()
			);
		}
		
		try {
			// Obter as faixas.
			return spotify.getTracks(pCategory);
		}
		catch (IOException | WebApiException e) {
			return new ArrayList<Track>();
		}
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pParam1 o parâmetro
	 * @param pParam2 o parâmetro
	 * @param pType o tipo
	 * @return playlist a lista de reprodução
	 */
	public List<Track> getTracks(String pParam1, String pParam2, int pType) {
		Recommendation recommendation = new Recommendation();
		
		try {
			if (pType == 0) {
				recommendation.getLocation().setCityName(pParam1 != null ? pParam1 : "");
				recommendation.getLocation().setCountryCode(pParam2 != null ? pParam2 : "");
				recommendation.getTemperature().setValue(
					openWeatherMap.getTemperature(pParam1, pParam2)
				);
			}
			else if (pType == 1) {
				float latitude = Float.valueOf(pParam1);
				float longitude = Float.valueOf(pParam2);
				recommendation.getLocation().setCoordinate(latitude, longitude);
				recommendation.getTemperature().setValue(
					openWeatherMap.getTemperature(latitude, longitude)
				);
			}
		}
		catch (CityNotFoundException exception) {
			throw new CityNotFoundException(
				Message.CITY_NOT_FOUND.getValue()
			);
		}
		catch (NullPointerException | NumberFormatException exception) {
			throw new NumberFormatException();
		}
		catch (IOException exception) {
			throw new OpenWeatherMapUnavailableException(
				Message.OPEN_WEATHER_MAP_UNAVAILABLE.getValue()
			);
		}
		
		// Definir a categoria.
		recommendation.getPlaylist().setCategory(
			spotify.getCategory(
				recommendation.getTemperature().getValue()
			).getName()
		);
		return getTracks(recommendation.getPlaylist().getCategory());
	}
}
