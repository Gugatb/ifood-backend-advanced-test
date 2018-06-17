package com.ifood.Playlist.entity;

public class Recommendation {
	private Location location;
	private Playlist playlist;
	private Temperature temperarute;
	
	/**
	 * Construtor da classe.
	 * @author Gugatb
	 * @date 05/06/2018
	 */
	public Recommendation() {
		this.location = new Location();
		this.playlist = new Playlist();
		this.temperarute = new Temperature();
	}
	
	/**
	 * Obter a localidade.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return location a localidade
	 */
	public Location getLocation() {
		return location;
	}
	
	/**
	 * Obter a lista de reprodução.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @return playlist a lista de reprodução
	 */
	public Playlist getPlaylist() {
		return playlist;
	}
	
	/**
	 * Obter a temperatura.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return temperature a temperatura
	 */
	public Temperature getTemperature() {
		return temperarute;
	}
	
	/**
	 * Definir a localidade.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pLocation a localidade
	 */
	public void setLocation(Location pLocation) {
		this.location = pLocation;
	}
	
	/**
	 * Definir a lista de reprodução.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pPlaylist a lista de reprodução
	 */
	public void setPlaylist(Playlist pPlaylist) {
		this.playlist = pPlaylist;
	}
	
	/**
	 * Definir a temperatura.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pTemperature a temperatura
	 */
	public void setTemperature(Temperature pTemperature) {
		this.temperarute = pTemperature;
	}
}
