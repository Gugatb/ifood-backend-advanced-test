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
public class RecommendationControllerTest extends TestCase {
	@Test
	public void testGetRecommendation1() throws Exception {
		given().when().get("/recommendation/city?cityname=campinas").then().statusCode(200);
	}
	
	@Test
	public void testGetRecommendation2() throws Exception {
		given().when().get("/recommendation/playlist/city?cityname=campinas").then().statusCode(200);
	}
	
	@Test
	public void testGetRecommendation3() throws Exception {
		given().when().get("/recommendation/track/city?cityname=campinas").then().statusCode(200);
	}
	
	@Test
	public void testGetRecommendation4() throws Exception {
		given().when().get("/recommendation/country?cityname=campinas&countrycode=br").then().statusCode(200);
	}
	
	@Test
	public void testGetRecommendation5() throws Exception {
		given().when().get("/recommendation/playlist/country?cityname=campinas&countrycode=br").then().statusCode(200);
	}
	
	@Test
	public void testGetRecommendation6() throws Exception {
		given().when().get("/recommendation/track/country?cityname=campinas&countrycode=br").then().statusCode(200);
	}
	
	@Test
	public void testGetRecommendation7() throws Exception {
		given().when().get("/recommendation/coordinate?latitude=52.3555177&longitude=-1.1743197000000691").then().statusCode(200);
	}
	
	@Test
	public void testGetRecommendation8() throws Exception {
		given().when().get("/recommendation/playlist/coordinate?latitude=52.3555177&longitude=-1.1743197000000691").then().statusCode(200);
	}
	
	@Test
	public void testGetRecommendation9() throws Exception {
		given().when().get("/recommendation/track/coordinate?latitude=52.3555177&longitude=-1.1743197000000691").then().statusCode(200);
	}
}
