package com.ifood.Playlist.constant;

public enum Message {
	CATEGORY_NOT_FOUND("CATEGORY_NOT_FOUND", "Categoria nao encontrada"),
	CITY_NOT_FOUND("CITY_NOT_FOUND", "Cidade nao encontrada"),
	INVALID_REQUEST_FORMAT("INVALID_REQUEST_FORMAT", "Formato da requisicao invalido"),
	OPEN_WEATHER_MAP_UNAVAILABLE("OPEN_WEATHER_MAP_UNAVAILABLE", "Servico 'Open Weather Map' indisponivel"),
	SPOTIFY_UNAVAILABLE("SPOTIFY_UNAVAILABLE", "Servico 'Spotify' indisponivel");
	
	// Valor padrão.
	public final static Message DEFAULT = CITY_NOT_FOUND;
	
	private String name;
	private String value;
	
	/**
	 * Contrutor da classe.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pName o nome
	 * @param pValue o valor
	 */
	Message(String pName, String pValue) {
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
		
		for (Message item : Message.values()) {
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
	public Message getConstant(String pName) {
		Message constant = null;
		
		for (Message item : Message.values()) {
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
