package com.ifood.Playlist.entity;

public class Location {
	private String cityName;
	private String countryCode;
	private float latitude;
	private float longitude;
	
	/**
	 * Construtor da classe.
	 * @author Gugatb
	 * @date 05/06/2018
	 */
	public Location() {
		this.cityName = "";
		this.countryCode = "";
		this.latitude = 0.0f;
		this.longitude = 0.0f;
	}
	
	/**
	 * Obter o nome da cidade.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return cityName o nome da cidade
	 */
	public String getCityName() {
		return cityName;
	}
	
	/**
	 * Obter o código do país.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return countryCode o código do país
	 */
	public String getCountryCode() {
		return countryCode;
	}
	
	/**
	 * Obter a latitude.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return latitude a latitude
	 */
	public float getLatitude() {
		return latitude;
	}
	
	/**
	 * Obter a longitude.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return longitude a longitude
	 */
	public float getLongitude() {
		return longitude;
	}
	
	/**
	 * Definir o nome da cidade.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pCityName o nome da cidade
	 */
	public void setCityName(String pCityName) {
		this.cityName = pCityName;
	}
	
	/**
	 * Definir a coordenada.
	 * @param pLatitude a latitude
	 * @param pLongitude a longitude
	 */
	public void setCoordinate(float pLatitude, float pLongitude) {
		this.latitude = pLatitude;
		this.longitude = pLongitude;
	}
	
	/**
	 * Definir o código do país.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pCountryCode o código do país
	 */
	public void setCountryCode(String pCountryCode) {
		this.countryCode = pCountryCode;
	}
	
	/**
	 * Definir a latitude.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pLatitude a latitude
	 */
	public void setLatitude(float pLatitude) {
		this.latitude = pLatitude;
	}
	
	/**
	 * Definir a longitude.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pLongitude a longitude
	 */
	public void setLongitude(float pLongitude) {
		this.longitude = pLongitude;
	}
}
