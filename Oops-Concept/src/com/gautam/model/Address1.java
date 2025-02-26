package com.gautam.model;

// Protect the Immutability feature 
public class Address1 {

	private String buildingName;
	private String city;
	private String state;

	public Address1(String buildingName, String city, String state) {
		super();
		this.buildingName = buildingName;
		this.city = city;
		this.state = state;
	}
	
	// To maintain the immutable feature by using copy constructor 
	public Address1(Address1 address) {
		this(address.getBuildingName(), address.getCity(), address.getCity());
	}

	public String getBuildingName() {
		return buildingName;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setState(String state) {
		this.state = state;
	}

	@Override
	public String toString() {
		return "Address1 [buildingName=" + buildingName + ", city=" + city + ", state=" + state + "]";
	}

}
