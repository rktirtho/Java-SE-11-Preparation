package com.rktirtho.ocp.creating_finit_string_sources;

import java.util.Random;
import java.util.stream.Stream;

public class CreateInfinitStream {
	
	public static void main(String[] args) {
		Stream<Double> stream = Stream.generate(Math::random);
		
		stream
		.limit(5)
		.sorted()
		.forEach(System.out::println);
		
//		Stream<Double> ittStream = Stream.iterate(1, x-> x+2.0); does not compile
		Stream<Integer> ittStream = Stream.iterate(1, x-> x+2);
		Stream<Integer> ittStreamEll = Stream.iterate(1,x->x<100, x-> x+2);
		ittStreamEll.forEach(System.out::println);
		System.out.println("====end====");
	}

}
