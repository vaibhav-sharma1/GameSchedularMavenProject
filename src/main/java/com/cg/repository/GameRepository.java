package com.cg.repository;

import com.cg.beans.Game;

public interface GameRepository {

	public abstract Game save(Game g);
	public abstract Game findByName(String name);
	
}
