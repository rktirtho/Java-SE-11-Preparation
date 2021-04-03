package com.rktirtho.ocp.building_interface;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Supplier;

public class ImplementingSupplier {
	public static void main(String[] args) {
		Supplier<LocalDate> localDateSupplierRef = LocalDate::now;
		Supplier<LocalDate> localDateSupplierLam = () -> LocalDate.now();
		
		LocalDate localDate = localDateSupplierRef.get();
//		LocalDate localDate = localDateSupplierLam.get(); // same work
		System.out.println(localDate);
		
		
		//=============building two stringBuilder Object====================
		
		Supplier<StringBuilder> sbSupplierRef = StringBuilder::new;
		Supplier<StringBuilder> sbSupplierlamb = ()-> new StringBuilder();
		
		// testing
		Function<String, StringBuilder> sbfunctionRef = StringBuilder::new;
		StringBuilder stringBuilder = sbfunctionRef.apply("You will pass the exam");
		System.out.println(stringBuilder);
		
		
//		Supplier<ArrayList<String>> alSupplierRef = ArrayList::new; //allow
		Supplier<ArrayList<String>> alSupplierRef = ArrayList::new;
		Supplier<ArrayList<String>> alSupplierLam = 
				() -> new ArrayList<String>(List.of("Rejaul","Karim"));
		System.out.println(alSupplierLam.get());

		
		
		
		

	}
}
