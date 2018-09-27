package com.cg.beans;

import java.util.List;
import java.util.Map;

public class DayReport {
	private String dayName;
	private Map<Game,List<Game>> report_based_on_game;
	
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	public Map<Game, List<Game>> getReport_based_on_game() {
		return report_based_on_game;
	}
	public void setReport_based_on_game(Map<Game, List<Game>> report_based_on_game) {
		this.report_based_on_game = report_based_on_game;
	} 
	
	
	
}
