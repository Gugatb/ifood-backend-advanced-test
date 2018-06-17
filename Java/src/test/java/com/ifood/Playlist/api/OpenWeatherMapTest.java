package com.ifood.Playlist.api;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ifood.Playlist.Setting;
import com.ifood.Playlist.api.OpenWeatherMap;
import com.ifood.Playlist.exception.CityNotFoundException;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Setting.class )
public class OpenWeatherMapTest extends TestCase {
	@Autowired
	OpenWeatherMap openWeatherMap;
	
	@Test
	public void testGetTemperature1() throws Exception {
		float temperature = openWeatherMap.getTemperature(52.3555177f, -1.1743197000000691f);
		Assert.assertTrue(temperature > 0.0f);
	}
	
	@Test
	public void testGetTemperature2() throws Exception {
		float temperature = openWeatherMap.getTemperature("campinas", "br");
		Assert.assertTrue(temperature > 0.0f);
	}
	
	@Test(expected = CityNotFoundException.class)
	public void testGetTemperature3() throws Exception {
		openWeatherMap.getTemperature("city not found", "br");
	}
}
