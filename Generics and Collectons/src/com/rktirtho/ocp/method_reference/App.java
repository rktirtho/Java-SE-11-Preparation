package com.rktirtho.ocp.method_reference;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class App {

	public static void main(String[] args) {
//		LearnToSpeak learner = s -> System.out.println(s);
		Tester tester = b-> true;
		makeSound("Quak");
		
		
		///========================= Section Method Reference=================
		var msg ="erer";
		// start with methode takes single parameter
		Predicate<String> methodRef = msg::startsWith;
		
		
		// is empty does not take any parameter
		Predicate<String>predicate = String::isEmpty;
		
	}

	public static void makeSound(String sound) {
		LearnToSpeak learner = System.out::print ;
		DuckHelper.teachToSpeak(sound, learner);
	}
	
	public static void strnwith() {
		
	}

}
