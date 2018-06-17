package com.ifood.Playlist.service;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifood.Playlist.api.OpenWeatherMap;
import com.ifood.Playlist.api.Spotify;
import com.ifood.Playlist.constant.Category;
import com.ifood.Playlist.constant.Message;
import com.ifood.Playlist.entity.Temperature;
import com.ifood.Playlist.exception.CityNotFoundException;
import com.ifood.Playlist.exception.OpenWeatherMapUnavailableException;

@Service("category")
public class CategoryService {
	@Autowired
	private OpenWeatherMap openWeatherMap;
	
	@Autowired
	private Spotify spotify;
	
	/**
	 * Obter a categoria.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pParam1 o parâmetro
	 * @param pParam2 o parâmetro
	 * @param pType o tipo
	 * @return category a categoria
	 */
	public Category getCategory(String pParam1, String pParam2, int pType) {
		Category category = Category.DEFAULT;
		Temperature temperature = new Temperature();
		
		try {
			if (pType == 0) {
				temperature.setValue(
					openWeatherMap.getTemperature(pParam1, pParam2)
				);
			}
			else if (pType == 1) {
				float latitude = Float.valueOf(pParam1);
				float longitude = Float.valueOf(pParam2);
				temperature.setValue(
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
		category = spotify.getCategory(
			temperature.getValue()
		);
		return category;
	}
}
