package com.ifood.Playlist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class App {
	/**
	 * Contrutor da classe.
	 * @author Gugatb
	 * @date 04/06/2018
	 * @param pArguments os argumentos
	 */
	public static void main(String[] pArguments) {
		System.setProperty("spring.profiles.default", "dev");
		SpringApplication.run(App.class, pArguments);
	}
}
