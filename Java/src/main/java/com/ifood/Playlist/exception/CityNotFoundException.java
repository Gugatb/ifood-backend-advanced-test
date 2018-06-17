package com.ifood.Playlist.exception;

public class CityNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -1887686020675148240L;
	
	/**
	 * Construtor da classe.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @param pText o texto
	 */
	public CityNotFoundException(String pText) {
		super(pText);
	}
}
