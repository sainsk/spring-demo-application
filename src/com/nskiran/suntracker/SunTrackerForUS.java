package com.nskiran.suntracker;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import com.nskiran.location.LocationService;

public class SunTrackerForUS implements StarTracker {

	private LocationService locationService;
	
	public SunTrackerForUS(LocationService mylocationService) {
		locationService = mylocationService;
	}
	
	@Override
	public String getExactSunRiseTime() throws UnsupportedEncodingException, IOException  {
		return "yet to be implemented";
	}
	
	@Override
	public String getAverageDailySunriseTime() {
		return "7:00 AM EDT";
	}

}
