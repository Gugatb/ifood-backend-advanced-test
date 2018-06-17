package com.ifood.Playlist.exception;

public class CategoryNotFoundException extends RuntimeException {
	private static final long serialVersionUID = -1887686020675148240L;
	
	/**
	 * Construtor da classe.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @param pText o texto
	 */
	public CategoryNotFoundException(String pText) {
		super(pText);
	}
}
