package com.cg.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when; 

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.cg.beans.Game;
import com.cg.repository.GameRepository;
import com.cg.service.GameService;
import com.cg.serviceImpl.GameServiceImpl; 


public class GameServiceTest {
	private GameService gameService;
	@Mock
	private GameRepository gameRepository;

	@Before
	public void init() {
		MockitoAnnotations.initMocks(this);
		gameService = new GameServiceImpl(gameRepository);
	}

	/* 1 : Adding Game Object with null value */
	@Test
	public void test_add_nullGameObject() {
		Game game = null;
		when(gameRepository.save(game)).thenReturn(game);
		assertEquals(game, null);
	}

	/* 2 : Game's Name can not be null */
	@Test
	public void test_add_nullGameName() {
		Game game = new Game();
		game.setName(null);
		gameService.add(game);
		
	}
	
	/* 3: Duplicate GameShould not be added*/
	@Test
	public void test_save_validGames() {
		Game game = new Game();
		game.setName("Cricket");
		when(gameRepository.findByName(game.getName())).thenReturn(game);
		gameService.add(game);
	}
	
	
}
