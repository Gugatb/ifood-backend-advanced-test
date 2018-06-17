package com.ifood.Playlist.constant;

import net.aksingh.owmjapis.OpenWeatherMap;

public enum Unit {
	CELSIUS("CELSIUS", OpenWeatherMap.Units.METRIC),
	FAHERNHEIT("FAHERNHEIT", OpenWeatherMap.Units.IMPERIAL);
	
	// Valor padrão.
	public final static Unit DEFAULT = CELSIUS;
	
	private String name;
	private OpenWeatherMap.Units value;
	
	/**
	 * Contrutor da classe.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pName o nome
	 * @param pValue o valor
	 */
	Unit(String pName, OpenWeatherMap.Units pValue) {
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
		
		for (Unit item : Unit.values()) {
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
	public Unit getConstant(String pName) {
		Unit constant = null;
		
		for (Unit item : Unit.values()) {
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
	public OpenWeatherMap.Units getValue() {
		return value;
	}
}
