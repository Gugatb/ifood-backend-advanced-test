package com.ifood.Playlist.entity;

public class Track {
	private String name;
	
	/**
	 * Construtor da classe.
	 * @author Gugatb
	 * @date 04/06/2018
	 */
	public Track() {
		this.name = "";
	}
	
	/**
	 * Construtor da classe.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @param pName o nome
	 */
	public Track(String pName) {
		this.name = pName;
	}
	
	/**
	 * Obter o nome.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @return name o nome
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Definir o nome.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @param pName o nome
	 */
	public void setName(String pName) {
		this.name = pName;
	}
}
