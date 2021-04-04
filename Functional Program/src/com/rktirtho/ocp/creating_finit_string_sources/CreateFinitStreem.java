package com.rktirtho.ocp.creating_finit_string_sources;

import java.util.List;
import java.util.stream.Stream;

public class CreateFinitStreem {

	public static void main(String[] args) {
		Stream<Double> randoms = Stream.generate(Math::random);
		Stream<Integer> oddNumbers = Stream.iterate(1, n -> n + 2);
		
		Stream<Integer> renStream = Stream.iterate(
				1,
				x->x==10,
				x->x+=2);
		
		Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		s.findAny().ifPresent(System.out::println);
		// monkey (usually)
		infinite.findAny().ifPresent(System.out::println); // chimp
				
		var list = List.of("Toby", "Anna", "Leroy", "Alex");
		list.stream().filter(n -> n.length() == 4).sorted()
		.limit(2).forEach(System.out::println);
		

	}

}
