package com.rkltirtho.ocp.date_and_time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class FormateDateAndTime {

	public static void main(String[] args) {
		LocalDate date = LocalDate.of(2021, Month.APRIL, 06);
		System.out.println(date.getDayOfWeek());
		System.out.println(date.getDayOfMonth());
		System.out.println(date.getDayOfYear());
		
		
		LocalDateTime dateTime =LocalDateTime.now();
		
		
		
		System.out.println(date.format(DateTimeFormatter.BASIC_ISO_DATE));
		System.out.println(date.format(DateTimeFormatter.ISO_DATE));
//		System.out.println(date.format(DateTimeFormatter.ISO_DATE_TIME)); // compile error
		System.out.println(dateTime.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println(dateTime.format(DateTimeFormatter.ISO_TIME));
		
		
		// Custom Formatter
		
		DateTimeFormatter f= 
				DateTimeFormatter.ofPattern("dd:MMMM:YYYY 'at' hh:mm");
		System.out.println(dateTime.format(f));
		
		
		DateFormat dateFormat = 
				new SimpleDateFormat("MMM dd yyy 'at' hh:mm a");
		System.out.println(dateFormat.format(new Date()));

	}

}
