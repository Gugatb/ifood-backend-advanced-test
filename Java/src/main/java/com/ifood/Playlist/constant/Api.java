package com.ifood.Playlist.constant;

public enum Api {
	OPEN_WEATHER_MAP_KEY("OPEN_WEATHER_MAP_KEY", ""),
	SPOTIFY_CLIENT_ID("SPOTIFY_CLIENT_ID", ""),
	SPOTIFY_SECRET("SPOTIFY_SECRET", "");
	
	// Valor padrão.
	public final static Api DEFAULT = OPEN_WEATHER_MAP_KEY;
	
	private String name;
	private String value;
	
	/**
	 * Contrutor da classe.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pName o nome
	 * @param pValue o valor
	 */
	Api(String pName, String pValue) {
		this.name = pName;
		this.value = pValue;
	}
	
	/**
	 * Verificar se contém o valor.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pValue o valor
	 * @return true se contém, caso contrário false
	 */
	public boolean contains(String pValue) {
		boolean contains = false;
		
		for (Api item : Api.values()) {
			if (item.getValue().equals(pValue)) {
				contains = true;
			}
		}
		return contains;
	}
	
	/**
	 * Obter a constante.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pName o nome
	 * @return constant a constante
	 */
	public Api getConstant(String pName) {
		Api constant = null;
		
		for (Api item : Api.values()) {
			if (item.getName().equals(pName)) {
				constant = item;
			}
		}
		return constant;
	}
	
	/**
	 * Obter o nome.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return name o nome
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Obter o valor.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return value o valor
	 */
	public String getValue() {
		return value;
	}
}
