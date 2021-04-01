package com.rktirtho.ocp.basic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;


public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearnToSpeach speach = x -> System.out.println(x);;
		DuckTrainer duckTrainer = new DuckTrainer();
		duckTrainer.teachSpeech("dfdf", speach);
		
//		MethodEmitter Reference 
//			1. Static Method
		Consumer<List<Integer>> consumerRef = Collections::sort;
		Consumer<List<Integer>> consumerLambd = x -> Collections.sort(x);;
		
//			2. CALLING INSTANCE METHODS ON A PARTICULAR OBJECT
		String name = "Rejaul Karim";
		
		Predicate<String> predicateRef = name::startsWith;
		Predicate<String> predicateLambd = x->name.startsWith(x);
		

		Supplier<Boolean> methodRef = name::isEmpty;
		
		Random random =new Random();
		Supplier<Integer> renNumber = random::nextInt;
		
		boolean b = predicateRef.test("R");
		System.out.println(b);
		
//		CALLING INSTANCE METHODS ON A PARAMETER
		Predicate<String> methodRefsd = String::isEmpty;
		
		
		
//		CALLING CONSTRUCTORS
		
		Supplier<List<String>> ccMethodRef = ArrayList::new;
		Supplier<List<String>> lambda = ()  -> new ArrayList();
		
		Function<List<String>, List<String>> 
		createListWith = ArrayList::new;
		Function<List<String>, List<String>> function = x-> new ArrayList(x);

	}

}
