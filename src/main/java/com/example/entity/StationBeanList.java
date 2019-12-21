package com.example.entity;

public class StationBeanList{

	private String id;
	private String stationName;
	private String availableDocks;
	private String totalDocks;
	private String latitude;
	private String longitude;
	private String statusValue;
	private String statusKey;
	private String availableBikes;
	private String stAddress1;
	private String stAddress2;
	private String city;
	private String postalCode;
	private String location;
	private String altitude;
	private String testStation;
	private String lastCommunicationTime;
	private String landMark;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStationName() {
		return stationName;
	}
	public void setStationName(String stationName) {
		this.stationName = stationName;
	}
	public String getAvailableDocks() {
		return availableDocks;
	}
	public void setAvailableDocks(String availableDocks) {
		this.availableDocks = availableDocks;
	}
	public String getTotalDocks() {
		return totalDocks;
	}
	public void setTotalDocks(String totalDocks) {
		this.totalDocks = totalDocks;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getStatusValue() {
		return statusValue;
	}
	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}
	public String getStatusKey() {
		return statusKey;
	}
	public void setStatusKey(String statusKey) {
		this.statusKey = statusKey;
	}
	public String getAvailableBikes() {
		return availableBikes;
	}
	public void setAvailableBikes(String availableBikes) {
		this.availableBikes = availableBikes;
	}
	public String getStAddress1() {
		return stAddress1;
	}
	public void setStAddress1(String stAddress1) {
		this.stAddress1 = stAddress1;
	}
	public String getStAddress2() {
		return stAddress2;
	}
	public void setStAddress2(String stAddress2) {
		this.stAddress2 = stAddress2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getAltitude() {
		return altitude;
	}
	public void setAltitude(String altitude) {
		this.altitude = altitude;
	}
	public String getTestStation() {
		return testStation;
	}
	public void setTestStation(String testStation) {
		this.testStation = testStation;
	}
	public String getLastCommunicationTime() {
		return lastCommunicationTime;
	}
	public void setLastCommunicationTime(String lastCommunicationTime) {
		this.lastCommunicationTime = lastCommunicationTime;
	}
	public String getLandMark() {
		return landMark;
	}
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	
	@Override
	public String toString() {
		return "StationBeanList [id=" + id + ", stationName=" + stationName + ", availableDocks=" + availableDocks
				+ ", totalDocks=" + totalDocks + ", latitude=" + latitude + ", longitude=" + longitude
				+ ", statusValue=" + statusValue + ", statusKey=" + statusKey + ", availableBikes=" + availableBikes
				+ ", stAddress1=" + stAddress1 + ", stAddress2=" + stAddress2 + ", city=" + city + ", postalCode="
				+ postalCode + ", location=" + location + ", altitude=" + altitude + ", testStation=" + testStation
				+ ", lastCommunicationTime=" + lastCommunicationTime + ", landMark=" + landMark + "]";
	}
	
}
