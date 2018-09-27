package com.cg.service;

import com.cg.beans.DayReport;
import com.cg.beans.GameReport;
import com.cg.beans.PlayerReport;

public interface ReportService {
	public abstract GameReport gameWiseReport(String g);
	public abstract PlayerReport playerWiseReport(String p);
	public abstract DayReport dayWiseReport(String d);
	
	
}
