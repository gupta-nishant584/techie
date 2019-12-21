package com.example.entity;

import java.util.List;

public class Station {

	
	private String executionTime;
	
	private List<StationBeanList> stationBeanList;

	public String getExecutionTime() {
		return executionTime;
	}

	public void setExecutionTime(String executionTime) {
		this.executionTime = executionTime;
	}

	public List<StationBeanList> getStationBeanList() {
		return stationBeanList;
	}

	public void setStationBeanList(List<StationBeanList> stationBeanList) {
		this.stationBeanList = stationBeanList;
	}

	@Override
	public String toString() {
		return "Station [executionTime=" + executionTime + ", stationBeanList=" + stationBeanList + "]";
	}
	
	
	
}
