package com.nskiran.suntracker;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public interface StarTracker {
	public  String getAverageDailySunriseTime();
	public String getExactSunRiseTime() throws UnsupportedEncodingException, IOException;
}
