package com.nskiran.location;

import java.util.HashSet;
import java.util.Set;

public class LocationServiceImpl implements LocationService {
	public Set<Double> getLatitudeLongitude(Location location){
		Set<Double> latLongPair = new HashSet<Double>();
		if(location.getCountry().equals("India")) {
			latLongPair.add(28.6139d);
			latLongPair.add(77.2090d);
		}else {
			//Defaulting to US location
			latLongPair.add(37.0902d);
			latLongPair.add(95.7129d);
		}
		return latLongPair;
	}
	
}
