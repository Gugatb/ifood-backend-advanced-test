package com.ifood.Playlist.api;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.cache.annotation.Cacheable;

import com.ifood.Playlist.constant.Category;
import com.ifood.Playlist.constant.Message;
import com.ifood.Playlist.constant.Temperature;
import com.ifood.Playlist.entity.Track;
import com.ifood.Playlist.exception.CategoryNotFoundException;
import com.wrapper.spotify.Api;
import com.wrapper.spotify.exceptions.WebApiException;
import com.wrapper.spotify.methods.TrackSearchRequest;
import com.wrapper.spotify.methods.authentication.ClientCredentialsGrantRequest;

public class Spotify {
	// Constantes da classe.
	private final String clientId;
	private final String secret;
	
	private Api api;
	private String accessToken;
	
	/**
	 * Contrutor da classe.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pName o nome
	 * @param pValue o valor
	 */
	public Spotify(String pClientId, String pSecret) {
		this.clientId = pClientId;
		this.secret = pSecret;
	}
	
	/**
	 * Conectar no Spotify.
	 * @author Gugatb
	 * @date 04/06/2018
	 */
	public void connect() throws IOException, WebApiException {
		if (accessToken == null) {
			accessToken = getAccessToken();
			api = Api.builder()
//			.redirectURI(uri)
			.clientSecret(secret)
			.clientId(clientId)
			.accessToken(accessToken)
			.build();
		}
	}
	
	/**
	 * Obter o token de acesso.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @return accessToken o token de acesso
	 */
	private String getAccessToken() throws IOException, WebApiException {
		Api api = Api.builder()
//		.redirectURI(uri)
		.clientSecret(secret)
		.clientId(clientId)
		.build();
		
		// Definir a credencial.
		ClientCredentialsGrantRequest credential = api.clientCredentialsGrant().build();
		return credential.get().getAccessToken();
	}
	
	/**
	 * Obter a categoria.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @param pTemperature a temperatura
	 * @return category a categoria
	 */
	public Category getCategory(float pTemperature) {
		Category category = null;
		
		try {
			Temperature temperature = Temperature.DEFAULT.getConstant(pTemperature);
			category = Category.DEFAULT.getConstant(temperature.getName());
		}
		catch (NullPointerException exception) {
			throw new CategoryNotFoundException(
				Message.CATEGORY_NOT_FOUND.getValue()
			);
		}
		return category;
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @param pCategory a categoria
	 * @return tracks as faixas
	 */
	@Cacheable(cacheNames = "tracks", key = "#pCategory")
	public List<Track> getTracks(String pCategory) throws IOException, WebApiException {
		TrackSearchRequest request = api.searchTracks(pCategory).build();
		List<Track> tracks = new ArrayList<Track>();
		
		// Definir as faixas.
		for (com.wrapper.spotify.models.Track track : request.get().getItems()) {
			tracks.add(new Track(track.getName()));
		}
		return tracks;
	}
}
