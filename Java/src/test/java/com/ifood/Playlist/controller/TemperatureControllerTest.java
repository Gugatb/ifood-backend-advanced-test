package com.ifood.Playlist.controller;

import static com.jayway.restassured.RestAssured.given;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ifood.Playlist.Setting;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Setting.class )
public class TemperatureControllerTest extends TestCase {
	@Test
	public void testGetTemperature1() throws Exception {
		given().when().get("/temperature/city?cityname=campinas").then().statusCode(200);
	}
	
	@Test
	public void testGetTemperature2() throws Exception {
		given().when().get("/temperature/country?cityname=campinas&countrycode=br").then().statusCode(200);
	}
	
	@Test
	public void testGetTemperature3() throws Exception {
		given().when().get("/temperature/coordinate?latitude=52.3555177&longitude=-1.1743197000000691").then().statusCode(200);
	}
}
