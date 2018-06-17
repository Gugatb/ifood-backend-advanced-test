package com.ifood.Playlist.entity;

import com.ifood.Playlist.constant.Unit;

public class Temperature {
	private String unit;
	private float value;
	
	/**
	 * Construtor da classe.
	 * @author Gugatb
	 * @date 05/06/2018
	 */
	public Temperature() {
		this.unit = Unit.DEFAULT.getName();
		this.value = 0.0f;
	}
	
	/**
	 * Construtor da classe.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pTemperature a temperatura
	 * @param pUnit a unidade
	 */
	public Temperature(float pValue, String pUnit) {
		this.unit = pUnit;
		this.value = pValue;
	}
	
	/**
	 * Obter a unidade.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return unit a unidade
	 */
	public String getUnit() {
		return unit;
	}
	
	/**
	 * Obter o valor.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return value o valor
	 */
	public float getValue() {
		return value;
	}
	
	/**
	 * Definir a unidade.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pUnit a unidade
	 */
	public void setUnit(String pUnit) {
		this.unit = pUnit;
	}
	
	/**
	 * Definir o valor.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pValue o valor
	 */
	public void setValue(float pValue) {
		this.value = pValue;
	}
}
