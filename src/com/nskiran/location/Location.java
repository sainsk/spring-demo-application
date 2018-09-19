package com.nskiran.location;

public class Location {
	String locationId;
	
	String city;
	String state;
	String country;
	
	String zipcode;
	
	boolean isCostalArea;

	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", city=" + city + ", state=" + state + ", country=" + country
				+ ", zipcode=" + zipcode + ", isCostalArea=" + isCostalArea + "]";
	}

	public String getLocationId() {
		return locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public boolean isCostalArea() {
		return isCostalArea;
	}

	public void setCostalArea(boolean isCostalArea) {
		this.isCostalArea = isCostalArea;
	}

}
