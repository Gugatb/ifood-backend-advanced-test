package com.ifood.Playlist.exception;

public class SpotifyUnavailableException extends RuntimeException {
	private static final long serialVersionUID = 4239256907011093097L;
	
	/**
	 * Construtor da classe.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @param pText o texto
	 */
	public SpotifyUnavailableException(String pText) {
		super(pText);
	}
}
