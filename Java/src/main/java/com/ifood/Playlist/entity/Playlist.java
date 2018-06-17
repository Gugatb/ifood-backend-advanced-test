package com.ifood.Playlist.entity;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
	private String category;
	private List<Track> tracks;
	
	/**
	 * Construtor da classe.
	 * @author Gugatb
	 * @date 05/06/2018
	 */
	public Playlist() {
		this.category = "";
		this.tracks = new ArrayList<Track>();
	}
	
	/**
	 * Construtor da classe.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pCategory a categoria
	 */
	public Playlist(String pCategory) {
		this.category = pCategory;
		this.tracks = new ArrayList<Track>();
	}
	
	/**
	 * Obter a categoria.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @return category a categoria
	 */
	public String getCategory() {
		return category;
	}
	
	/**
	 * Obter as faixas.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @return tracks as faixas
	 */
	public List<Track> getTracks() {
		return tracks;
	}
	
	/**
	 * Definir a categoria.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pCategory a categoria
	 */
	public void setCategory(String pCategory) {
		this.category = pCategory;
	}
	
	/**
	 * Definir as faixas.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pTracks as faixas
	 */
	public void setTracks(List<Track> pTracks) {
		this.tracks = pTracks;
	}
}
