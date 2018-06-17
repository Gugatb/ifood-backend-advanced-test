package com.ifood.Playlist.exception;

public class OpenWeatherMapUnavailableException extends RuntimeException {
	private static final long serialVersionUID = 2009400729965083948L;
	
	/**
	 * Construtor da classe.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @param pText o texto
	 */
	public OpenWeatherMapUnavailableException(String pText) {
		super(pText);
	}
}
