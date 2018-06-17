package com.ifood.Playlist.constant;

public enum Category {
	CLASSICAL("CLASSICAL", "classical"),
	PARTY("PARTY", "party"),
	POP("POP", "pop"),
	ROCK("ROCK", "rock");
	
	// Valor padrão.
	public final static Category DEFAULT = CLASSICAL;
	
	private String name;
	private String value;
	
	/**
	 * Contrutor da classe.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pName o nome
	 * @param pValue o valor
	 */
	Category(String pName, String pValue) {
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
		
		for (Category item : Category.values()) {
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
	public Category getConstant(String pName) {
		Category constant = null;
		
		for (Category item : Category.values()) {
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
