package com.ifood.Playlist.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ifood.Playlist.api.Spotify;
import com.ifood.Playlist.constant.Message;
import com.ifood.Playlist.entity.Playlist;
import com.ifood.Playlist.entity.Track;
import com.ifood.Playlist.exception.SpotifyUnavailableException;
import com.wrapper.spotify.exceptions.WebApiException;

@Service("spotify")
public class SpotifyService {
	@Autowired
	private Spotify spotify;
	
	/**
	 * Obter a lista de reprodução.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pCategory a categoria
	 * @return playlist a lista de reprodução
	 */
	public Playlist getPlaylist(String pCategoy) {
		Playlist playlist = new Playlist(pCategoy);
		playlist.setTracks(getTracks(pCategoy));
		return playlist;
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pCategory a categoria
	 * @return tracks as faixas
	 */
	public List<Track> getTracks(String pCategory) {
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
}
