package com.cg.serviceImpl;
import com.cg.beans.Game;
import com.cg.repository.GameRepository;
import com.cg.repositoryImpl.GameRepositoryImpl;
import com.cg.service.*;

public class GameServiceImpl implements GameService {

	private GameRepository gameRepository;
	
	public GameServiceImpl() {
		// TODO Auto-generated constructor stub
	}
	
	public GameServiceImpl(GameRepository gameRepository) {
		super();
		this.gameRepository = gameRepository;
		
	}

	public Game add(Game g) {
		// TODO Auto-generated method stub
		if(g==null || g.getName()==null || g.getNo_of_days()<1) {
			throw new IllegalArgumentException();
		}
		
		Game existing_game = gameRepository.findByName(g.getName());
		
		if(existing_game!=null) {
			// Throws exception
		}
		
		
		return gameRepository.save(g);
	}



}
