package com.nskiran.suntracker;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpringApp {

	public static void main(String[] args) {
		// Load Spring Config File
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//Retrive it
		 StarTracker trackstar = context.getBean("mytracker", StarTracker.class);
		//call Method of it
		 
		System.out.println(trackstar.getAverageDailySunriseTime());
		try {
			System.out.println(trackstar.getExactSunRiseTime());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Always remember to close the context
		context.close();

	}

}
