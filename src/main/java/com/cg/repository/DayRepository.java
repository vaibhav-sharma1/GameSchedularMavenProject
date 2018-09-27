package com.cg.repository;

import com.cg.beans.Day;

public interface DayRepository {
	public abstract Day save(Day d);
	public abstract Day findByName(String name);
	public abstract Day findByGamesName(String name);
	

}
