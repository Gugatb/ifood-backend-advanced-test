package com.ifood.Playlist.constant;

public enum Temperature {
	CLASSICAL("CLASSICAL", -200.0f, 9.0f),
	PARTY("PARTY", 31.0f, 200.0f),
	POP("POP", 15.0f, 30.0f),
	ROCK("ROCK", 10.0f, 14.0f);
	
	// Valor padrão.
	public final static Temperature DEFAULT = CLASSICAL;
	
	private float bottomValue;
	private String name;
	private float topValue;
	
	/**
	 * Contrutor da classe.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pName o nome
	 * @param pBottomValue o valor inferior
	 * @param pTopValue o valor superior
	 */
	Temperature(String pName, float pBottomValue, float pTopValue) {
		this.bottomValue = pBottomValue;
		this.name = pName;
		this.topValue = pTopValue;
	}
	
	/**
	 * Verificar se contém o valor.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pValue o valor
	 * @return true se contém, caso contrário false
	 */
	public boolean contains(float pValue) {
		boolean contains = false;
		
		for (Temperature item : Temperature.values()) {
			float bottomValue = item.getBottomValue();
			float topValue = item.getTopValue();
			
			if ((Float.compare(bottomValue, pValue) < 0 || Float.compare(bottomValue, pValue) == 0) &&
				(Float.compare(topValue, pValue) > 0 || Float.compare(topValue, pValue) == 0)) {
				contains = true;
			}
		}
		return contains;
	}
	
	/**
	 * Obter o valor inferior.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return bottomValue o valor do inferior
	 */
	public float getBottomValue() {
		return bottomValue;
	}
	
	/**
	 * Obter a constante.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pName o nome
	 * @return constant a constante
	 */
	public Temperature getConstant(String pName) {
		Temperature constant = null;
		
		for (Temperature item : Temperature.values()) {
			if (item.getName().equals(pName)) {
				constant = item;
			}
		}
		return constant;
	}
	
	/**
	 * Obter a constante.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @param pValue o valor
	 * @return constant a constante
	 */
	public Temperature getConstant(float pValue) {
		Temperature constant = null;
		
		for (Temperature item : Temperature.values()) {
			float bottomValue = item.getBottomValue();
			float topValue = item.getTopValue();
			
			if ((Float.compare(bottomValue, pValue) < 0 || Float.compare(bottomValue, pValue) == 0) &&
				(Float.compare(topValue, pValue) > 0 || Float.compare(topValue, pValue) == 0)) {
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
	 * Obter o valor superior.
	 * @author Gugatb
	 * @date 05/06/2018
	 * @return topValue o valor do superior
	 */
	public float getTopValue() {
		return topValue;
	}
}
