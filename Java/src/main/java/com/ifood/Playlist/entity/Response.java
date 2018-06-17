package com.ifood.Playlist.entity;

import java.util.Date;

public class Response {
	private Object response;
	private Date time;
	
	/**
	 * Construtor da classe.
	 * @author Gugatb
	 * @date 06/06/2018
	 */
	public Response() {
		this.response = new Object();
		this.time = new Date(System.currentTimeMillis());
	}
	
	/**
	 * Obter a resposta.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @return response a resposta
	 */
	public Object getResponse() {
		return response;
	}
	
	/**
	 * Obter o horário.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @return time o horário
	 */
	public Date getTime() {
		return time;
	}
	
	/**
	 * Definir a resposta.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pResponse a resposta
	 */
	public void setResponse(Object pResponse) {
		this.response = pResponse;
	}
	
	/**
	 * Definir o horário.
	 * @author Gugatb
	 * @date 06/06/2018
	 * @param pTime o horário
	 */
	public void setTime(Date pTime) {
		this.time = pTime;
	}
}
