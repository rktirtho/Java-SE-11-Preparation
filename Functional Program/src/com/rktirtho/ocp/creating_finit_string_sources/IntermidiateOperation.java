package com.rktirtho.ocp.creating_finit_string_sources;

import java.util.stream.Stream;

public class IntermidiateOperation {
public static void main(String[] args) {
	Stream<String> names = Stream.of("Rejaul", "Halim", "Raahim", "Himel");
	names
	.filter(x -> x.startsWith("R"))
	.limit(3)
	.sorted()
	.forEach(System.out::println);
	
	Stream.generate(() -> "Elsa")
	.filter(n -> n.length() == 4)
	.limit(2)
	.sorted()
	.forEach(System.out::println);
}
}
