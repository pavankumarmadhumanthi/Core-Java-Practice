package com.java.DateandTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Dates {

	public static void main(String[] args) {
		LocalTime time=LocalTime.now();
		System.out.println(time);
		int hour = time.getHour();
		
		System.out.println(hour);
		LocalDate date=LocalDate.now();
		System.out.println(date);
		int dayOfYear = date.getDayOfYear();
		System.out.println(dayOfYear);
		int year = date.getYear();
		System.out.println(year);
		
		
	}

}
