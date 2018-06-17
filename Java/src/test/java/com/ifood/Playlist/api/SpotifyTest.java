package com.ifood.Playlist.api;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ifood.Playlist.Setting;
import com.ifood.Playlist.api.Spotify;
import com.ifood.Playlist.constant.Category;
import com.ifood.Playlist.exception.CategoryNotFoundException;

import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = Setting.class )
public class SpotifyTest extends TestCase {
	@Autowired
	Spotify spotify;
	
	@Test
	public void testGetCategory1() throws Exception {
		Category category = spotify.getCategory(5.0f);
		Assert.assertTrue(category.getName().equals(Category.CLASSICAL.getName()));
	}
	
	@Test
	public void testGetCategory2() throws Exception {
		Category category = spotify.getCategory(32.0f);
		Assert.assertTrue(category.getName().equals(Category.PARTY.getName()));
	}
	
	@Test
	public void testGetCategory3() throws Exception {
		Category category = spotify.getCategory(20.0f);
		Assert.assertTrue(category.getName().equals(Category.POP.getName()));
	}
	
	@Test
	public void testGetCategory4() throws Exception {
		Category category = spotify.getCategory(12.0f);
		Assert.assertTrue(category.getName().equals(Category.ROCK.getName()));
	}
	
	@Test(expected = CategoryNotFoundException.class)
	public void testGetCategory5() throws Exception {
		spotify.getCategory(-2000.0f);
	}
}
