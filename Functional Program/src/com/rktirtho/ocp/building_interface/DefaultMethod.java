package com.rktirtho.ocp.building_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class DefaultMethod {

	public static void main(String[] args) {
		Predicate<String> egg = s -> s.contains("egg");
		Predicate<String> brown = s -> s.contains("brown");
		
//		Predicate<String> brownEggs =
//				s -> s.contains("egg") && s.contains("brown");
//				Predicate<String> otherEggs =
//				s -> s.contains("egg") && ! s.contains("brown");	
		Predicate<String> brownEggs = egg.and(brown);
		Predicate<String> otherEggs = egg.and(brown.negate());
		
		System.out.println(brownEggs.test("egg brown"));  //true
		System.out.println(otherEggs.test("egg white f")); //true
	
	
	
		Consumer<String> c1 = x -> System.out.print("1: " + x);
		Consumer<String> c2 = x -> System.out.println(",2: " + x);
		Consumer<String> combined = c1.andThen(c2);
		combined.accept("Annie");		// 1: Annie,2: Annie
		
		
		Function<Integer, Integer> before = x -> x + 1;
		Function<Integer, Integer> after = x -> x * 2;
		Function<Integer, Integer> combineds = after.compose(before);
		System.out.println(combineds.apply(3));		// 8
	
	}
}
