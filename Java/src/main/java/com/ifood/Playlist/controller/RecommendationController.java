package com.ifood.Playlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ifood.Playlist.constant.Message;
import com.ifood.Playlist.entity.Recommendation;
import com.ifood.Playlist.entity.Response;
import com.ifood.Playlist.exception.CityNotFoundException;
import com.ifood.Playlist.exception.OpenWeatherMapUnavailableException;
import com.ifood.Playlist.exception.SpotifyUnavailableException;
import com.ifood.Playlist.service.RecommendationService;

@RestController
@RequestMapping("/recommendation")
public class RecommendationController {
	@Autowired
	private RecommendationService service;
	
	/**
	 * Executar o serviço.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pParam1 o parâmetro
	 * @param pParam2 o parâmetro
	 * @param pMode o modo
	 * @param pType o tipo
	 * @return response a resposta
	 */
	private ResponseEntity execute(String pParam1, String pParam2, int pMode, int pType) {
		Response response = new Response();
		
		try {
			if (pMode == 0) {
				response.setResponse(
					service.getRecommendation(pParam1, pParam2, pType)
				);
			}
			else if (pMode == 1) {
				response.setResponse(
					service.getPlaylist(pParam1, pParam2, pType)
				);
			}
			else if (pMode == 2) {
				response.setResponse(
					service.getTracks(pParam1, pParam2, pType)
				);
			}
		}
		catch (CityNotFoundException exception) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
				Message.CITY_NOT_FOUND.getValue()
			);
		}
		catch (NumberFormatException exception) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(
				Message.INVALID_REQUEST_FORMAT.getValue()
			);
		}
		catch (OpenWeatherMapUnavailableException exception) {
			return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(
				Message.OPEN_WEATHER_MAP_UNAVAILABLE.getValue()
			);
		}
		catch (SpotifyUnavailableException exception) {
			return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).body(
				Message.SPOTIFY_UNAVAILABLE.getValue()
			);
		}
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/city", method = RequestMethod.GET)
	public ResponseEntity getTracksByCity(
		@RequestParam(value = "cityname")String cityName) {
		return execute(cityName, null, 0, 0);
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/playlist/city", method = RequestMethod.GET)
	public ResponseEntity getTracksByCity2(
		@RequestParam(value = "cityname")String cityName) {
		return execute(cityName, null, 1, 0);
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/track/city", method = RequestMethod.GET)
	public ResponseEntity getTracksByCity3(
		@RequestParam(value = "cityname")String cityName) {
		return execute(cityName, null, 2, 0);
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public ResponseEntity getTracksByCountry(
		@RequestParam(value = "cityname")String cityName,
		@RequestParam(value = "countrycode")String countryCode) {
		return execute(cityName, countryCode, 0, 0);
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/playlist/country", method = RequestMethod.GET)
	public ResponseEntity getTracksByCountry2(
		@RequestParam(value = "cityname")String cityName,
		@RequestParam(value = "countrycode")String countryCode) {
		return execute(cityName, countryCode, 1, 0);
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/track/country", method = RequestMethod.GET)
	public ResponseEntity getTracksByCountry3(
		@RequestParam(value = "cityname")String cityName,
		@RequestParam(value = "countrycode")String countryCode) {
		return execute(cityName, countryCode, 2, 0);
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/coordinate", method = RequestMethod.GET)
	public ResponseEntity getTracksByCoordinate(
		@RequestParam(value = "latitude")String latitude,
		@RequestParam(value = "longitude")String longitude) {
		return execute(latitude, longitude, 0, 1);
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/playlist/coordinate", method = RequestMethod.GET)
	public ResponseEntity getTracksByCoordinate2(
		@RequestParam(value = "latitude")String latitude,
		@RequestParam(value = "longitude")String longitude) {
		return execute(latitude, longitude, 1, 1);
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/track/coordinate", method = RequestMethod.GET)
	public ResponseEntity getTracksByCoordinate3(
		@RequestParam(value = "latitude")String latitude,
		@RequestParam(value = "longitude")String longitude) {
		return execute(latitude, longitude, 2, 1);
	}
}
