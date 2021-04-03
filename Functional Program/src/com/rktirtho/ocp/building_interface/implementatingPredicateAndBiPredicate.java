package com.rktirtho.ocp.building_interface;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class implementatingPredicateAndBiPredicate {

	public static void main(String[] args) {

		Predicate<String> predicateRef = String::isEmpty;
		Predicate<String> predicateLam = x -> x.isEmpty();

		System.out.println(predicateRef.test("")); // true
		System.out.println(predicateLam.test("Hello!")); // False

		BiPredicate<String, String> b1 = String::startsWith;
		BiPredicate<String, String> b2 = (string, prefix) -> string.startsWith(prefix);

		System.out.println(b1.test("Rejaul", "R")); //true

	}

}
