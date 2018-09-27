package com.cg.repository;

import com.cg.beans.Player;

public interface PlayerRepository {
	public abstract Player save (Player p);
	public abstract Player findByName( String name);
	public abstract Player findByGamesName(String name);
	
}
