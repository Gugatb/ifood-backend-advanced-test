package com.ifood.Playlist.api;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;

import com.ifood.Playlist.constant.Message;
import com.ifood.Playlist.constant.Unit;
import com.ifood.Playlist.exception.CityNotFoundException;

import net.aksingh.owmjapis.CurrentWeather;

public class OpenWeatherMap {
	@Autowired
	private net.aksingh.owmjapis.OpenWeatherMap owm;
	
	/**
	 * Obter a temperatura.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return temperature a temperatura
	 */
	@Cacheable(cacheNames = "temperatureByCityName", key = "{#pCityName, #pCountryCode}")
	public float getTemperature(String pCityName, String pCountryCode) throws IOException, CityNotFoundException {
		owm.setUnits(Unit.DEFAULT.getValue());
		return getTemperature(
			pCountryCode != null ?
			owm.currentWeatherByCityName(pCityName, pCountryCode) :
			owm.currentWeatherByCityName(pCityName)
		);
	}
	
	/**
	 * Obter a temperatura.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @param pCurrentWeather o clima atual
	 * @return temperature a temperatura
	 */
	private float getTemperature(CurrentWeather pCurrentWeather) {
		if (pCurrentWeather.isValid()) {
			return pCurrentWeather.getMainInstance().getTemperature();
		}
		else {
			throw new CityNotFoundException(
				Message.CITY_NOT_FOUND.getValue()
			);
		}
	}
	
	/**
	 * Obter a temperatura.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @param pLatitude a latitude
	 * @param pLongitude a longitude
	 * @return temperature a temperatura
	 */
	@Cacheable(cacheNames = "temperatureByCoordinate", key = "{#pLatitude, #pLongitude}")
	public float getTemperature(float pLatitude, float pLongitude) throws IOException, CityNotFoundException {
		owm.setUnits(Unit.DEFAULT.getValue());
		return getTemperature(
			owm.currentWeatherByCoordinates(pLatitude, pLongitude)
		);
	}
}
