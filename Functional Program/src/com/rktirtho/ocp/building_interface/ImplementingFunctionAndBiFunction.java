package com.rktirtho.ocp.building_interface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ImplementingFunctionAndBiFunction {
	
	public static void main(String[] args) {
		Function<String, Boolean> f1 = String::isEmpty;
		
		
		BiFunction<String, String, String> b1 = String::concat;
		BiFunction<String, String, String> b2 =
		(string, toAdd) -> string.concat(toAdd);
		System.out.println(b1.apply("baby ", "chick")); // baby chick
		System.out.println(b2.apply("baby ", "chick")); // baby chick

	}

}
