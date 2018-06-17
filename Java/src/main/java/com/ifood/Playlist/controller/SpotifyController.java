package com.ifood.Playlist.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ifood.Playlist.constant.Category;
import com.ifood.Playlist.constant.Message;
import com.ifood.Playlist.entity.Response;
import com.ifood.Playlist.exception.CategoryNotFoundException;
import com.ifood.Playlist.exception.SpotifyUnavailableException;
import com.ifood.Playlist.service.SpotifyService;

@RestController
@RequestMapping("/spotify")
public class SpotifyController {
	@Autowired
	private SpotifyService service;
	
	/**
	 * Executar o serviço.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pParam o parâmetro
	 * @param pMode o modo
	 * @return response a resposta
	 */
	private ResponseEntity execute(String pParam, int pMode) {
		Response response = new Response();
		
		try {
			if (Category.DEFAULT.contains(pParam)) {
				if (pMode == 0) {
					response.setResponse(
						service.getPlaylist(pParam)
					);
				}
				else if (pMode == 1) {
					response.setResponse(
						service.getTracks(pParam)
					);
				}
			}
			else {
				throw new CategoryNotFoundException(
					Message.CATEGORY_NOT_FOUND.getValue()
				);
			}
		}
		catch (CategoryNotFoundException exception) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(
				Message.CATEGORY_NOT_FOUND.getValue()
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
	 * @date 06/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/playlist/{category}", method = RequestMethod.GET)
	public ResponseEntity getPlaylist(
		@PathVariable("category")String category) {
		return execute(category, 0);
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pCityName o nome da cidade
	 * @param pCountryCode o código do país
	 * @return response a resposta
	 */
	@RequestMapping(value = "/track/{category}", method = RequestMethod.GET)
	public ResponseEntity getTracks(
		@PathVariable("category")String category) {
		return execute(category, 1);
	}
}
