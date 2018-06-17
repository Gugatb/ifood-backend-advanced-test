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
public class CategoryControllerTest extends TestCase {
	@Test
	public void testGetCategory1() throws Exception {
		given().when().get("/category/city?cityname=campinas").then().statusCode(200);
	}
	
	@Test
	public void testGetCategory2() throws Exception {
		given().when().get("/category/country?cityname=campinas&countrycode=br").then().statusCode(200);
	}
	
	@Test
	public void testGetCategory3() throws Exception {
		given().when().get("/category/coordinate?latitude=52.3555177&longitude=-1.1743197000000691").then().statusCode(200);
	}
}
