package com.rktirtho.text;

import java.sql.Date;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Calendar;

public class JavaDateTimeDemo {
	
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate anotherDate = LocalDate.of(2012, 12, 16);
		System.out.println(anotherDate);
		
		
		LocalTime time = LocalTime.now();
		System.out.println(time);
		LocalTime anotherTime = LocalTime.of(11, 20, 16);
		System.out.println(anotherTime);
		
		// Return date and time in '2021-03-07T15:27:21.709968' formate
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println(dateTime);
		// change the date
		LocalDateTime priviousDay = dateTime.withHour(3);
		System.out.println(priviousDay);
		
		
		// Return date and time in 'Sun Mar 07 15:22:40 BDT 2021' formate
		java.util.Date calendar = Calendar.getInstance().getTime();
		System.out.println(calendar);
		
	}

}
