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
public class SpotifyControllerTest extends TestCase {
	@Test
	public void testGetSpotify1() throws Exception {
		given().when().get("/spotify/playlist/classical").then().statusCode(200);
	}
	
	@Test
	public void testGetSpotify2() throws Exception {
		given().when().get("/spotify/playlist/party").then().statusCode(200);
	}
	
	@Test
	public void testGetSpotify3() throws Exception {
		given().when().get("/spotify/playlist/pop").then().statusCode(200);
	}
	
	@Test
	public void testGetSpotify4() throws Exception {
		given().when().get("/spotify/playlist/rock").then().statusCode(200);
	}
	
	@Test
	public void testGetSpotify5() throws Exception {
		given().when().get("/spotify/track/classical").then().statusCode(200);
	}
	
	@Test
	public void testGetSpotify6() throws Exception {
		given().when().get("/spotify/track/party").then().statusCode(200);
	}
	
	@Test
	public void testGetSpotify7() throws Exception {
		given().when().get("/spotify/track/pop").then().statusCode(200);
	}
	
	@Test
	public void testGetSpotify8() throws Exception {
		given().when().get("/spotify/track/rock").then().statusCode(200);
	}
}
