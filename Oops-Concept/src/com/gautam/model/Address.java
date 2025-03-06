package com.gautam.model;


// Create the Immutable class by using Cloneable interface
public class Address implements Cloneable {

	private String buildingName;
	private String city;
	private String state;

	public Address(String buildingName, String city, String state) {
		super();
		this.buildingName = buildingName;
		this.city = city;
		this.state = state;
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
		return "Address [buildingName=" + buildingName + ", city=" + city + ", state=" + state + "]";
	}

	
	public Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}
