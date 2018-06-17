package com.ifood.Playlist;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.ifood.Playlist.api.OpenWeatherMap;
import com.ifood.Playlist.api.Spotify;
import com.ifood.Playlist.constant.Api;

@Configuration
public class Setting {
	/**
	 * Obter o 'Open Wheather Map'.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return openWheatherMap o 'Open Wheather Map'
	 */
	@Bean
	public OpenWeatherMap getOpenWheatherMap() {
		return new OpenWeatherMap();
	}
	
	/**
	 * Obter o chave.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return openWheatherMapKey a chave
	 */
	public String getOpenWheatherMapKey() {
		return Api.OPEN_WEATHER_MAP_KEY.getValue();
	}
	
	/**
	 * Obter o 'Open Wheather Map'.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return openWheatherMap o 'Open Wheather Map'
	 */
	@Bean
	public net.aksingh.owmjapis.OpenWeatherMap getOwn() {
		return new net.aksingh.owmjapis.OpenWeatherMap(
			Api.OPEN_WEATHER_MAP_KEY.getValue()
		);
	}
	
	/**
	 * Obter o 'Spotify'.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return spotify o 'Spotify'
	 */
	@Bean
	public Spotify getSpotify() {
		return new Spotify(
			getSpotifyClientId(),
			getSpotifySecret()
		);
	}
	
	/**
	 * Obter o id do cliente.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return spotifyClientId o id do cliente
	 */
	public String getSpotifyClientId() {
		return Api.SPOTIFY_CLIENT_ID.getValue();
	}
	
	/**
	 * Obter o segredo.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return spotifySecret o segredo
	 */
	public String getSpotifySecret() {
		return Api.SPOTIFY_SECRET.getValue();
	}
}
