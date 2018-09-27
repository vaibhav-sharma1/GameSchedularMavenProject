package com.cg.beans;

import java.util.List;
import java.util.Map;

public class PlayerReport {
	private String playerName;
	private Map<Game,List<Day>> games_played_on_days ;
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Map<Game, List<Day>> getGames_played_on_days() {
		return games_played_on_days;
	}
	public void setGames_played_on_days(Map<Game, List<Day>> games_played_on_days) {
		this.games_played_on_days = games_played_on_days;
	}
	
	
}
