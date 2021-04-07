package com.rkltirtho.ocp.ocalization_and_internationalization;

import java.time.LocalDateTime;
import java.util.Locale;
import java.util.Scanner;

import jdk.vm.ci.meta.Local;

public class CreateLocal {

	public static void main(String[] args) {
		Locale locale = Locale.getDefault();
		System.out.println(locale);
		
		
		Locale germany = Locale.GERMANY;
		System.out.println(germany);
		
		Locale india = new Locale("hi", "IN");
		System.out.println(india);
		
		Locale canada = new Locale
				.Builder()
				.setRegion("CN")
				.setLanguage("en")
				.build();
		System.out.println(canada);
		
		Locale.setDefault(india);
		
		System.out.println(Locale.getDefault());
		
		System.out.println(LocalDateTime.now());

		

	}

}


