package com.nskiran.suntracker;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.nskiran.location.Location;
import com.nskiran.location.LocationService;

public class SunTrackerForIndia implements StarTracker {
	
	private LocationService locationService;
	
	
	Location location;
	
	
	public SunTrackerForIndia(LocationService mylocationService, Location loc) {
		locationService = mylocationService;
        location = loc;
	}
	
	public  String getAverageDailySunriseTime() {
		return "6:00 AM IST";
	}
	
	public String getExactSunRiseTime() throws UnsupportedEncodingException, IOException {
		
		Map<String, String> parameters = new HashMap<>();
		StringBuffer response = null;
		Set<Double> coOrdinatesSet = locationService.getLatitudeLongitude(location);
		coOrdinatesSet.forEach((co_ordinate) -> {
			parameters.putIfAbsent("lat", co_ordinate.toString());
			parameters.putIfAbsent("lng", co_ordinate.toString());
		});
		 
		
		DataOutputStream out;
		try {
			URL url;
			url = new URL("http://api.sunrise-sunset.org/json?" + ParameterStringBuilder.getParamsString(parameters));
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			
			
			con.setDoInput(true);
			con.setDoOutput(true);
			con.setRequestProperty("Content-Type", "application/json");
			con.setRequestMethod("GET");
			out = new DataOutputStream(con.getOutputStream());
			System.out.println(out.toString());
			BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
			String inputLine;
			StringBuffer content = new StringBuffer();
			while ((inputLine = in.readLine()) != null) {
				content.append(inputLine);
			}
			in.close();
			out.flush();
			out.close();
			response = content;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return response.toString();
	}
	
}
