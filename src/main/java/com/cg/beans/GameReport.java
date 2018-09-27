package com.cg.beans;

import java.util.List;

public class GameReport {
	private String name;
	private List<Player> player;
	private List<Day> day;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Player> getPlayer() {
		return player;
	}
	public void setPlayer(List<Player> player) {
		this.player = player;
	}
	public List<Day> getDay() {
		return day;
	}
	public void setDay(List<Day> day) {
		this.day = day;
	}
	
	
}
