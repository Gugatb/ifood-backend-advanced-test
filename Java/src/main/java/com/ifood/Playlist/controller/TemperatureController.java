package com.ifood.Playlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ifood.Playlist.constant.Message;
import com.ifood.Playlist.entity.Response;
import com.ifood.Playlist.entity.Temperature;
import com.ifood.Playlist.exception.CityNotFoundException;
import com.ifood.Playlist.exception.OpenWeatherMapUnavailableException;
import com.ifood.Playlist.service.TemperatureService;

@RestController
@RequestMapping("/temperature")
public class TemperatureController {
	@Autowired
	private TemperatureService service;
	
	/**
	 * Executar o serviço.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pParam1 o parâmetro
	 * @param pParam2 o parâmetro
	 * @param pType o tipo
	 * @return response a resposta
	 */
	private ResponseEntity execute(String pParam1, String pParam2, int pType) {
		Response response = new Response();
		
		try {
			response.setResponse(
				service.getTemperature(pParam1, pParam2, pType)
			);
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
		return new ResponseEntity(response, HttpStatus.OK);
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/city", method = RequestMethod.GET)
	public ResponseEntity getTracksByCity(
		@RequestParam(value = "cityname")String cityName) {
		return execute(cityName, null, 0);
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/country", method = RequestMethod.GET)
	public ResponseEntity getTracksByCountry(
		@RequestParam(value = "cityname")String cityName,
		@RequestParam(value = "countrycode")String countryCode) {
		return execute(cityName, countryCode, 0);
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/coordinate", method = RequestMethod.GET)
	public ResponseEntity getTracksByCoordinate(
		@RequestParam(value = "latitude")String latitude,
		@RequestParam(value = "longitude")String longitude) {
		return execute(latitude, longitude, 1);
	}
}
