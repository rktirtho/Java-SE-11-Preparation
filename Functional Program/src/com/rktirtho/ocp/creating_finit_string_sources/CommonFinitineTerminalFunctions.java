package com.rktirtho.ocp.creating_finit_string_sources;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class CommonFinitineTerminalFunctions {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(4,3,84,89,452,24);
		
//		Optional<Integer> min = stream
//				.min((s1, s2) -> s1-s2);
		
		Optional<Integer> max = stream
				.max((x,y)->x-y);
		
//		min.ifPresent(System.out::println);
		max.ifPresent(System.out::println);
		
		
		var list = List.of("monkey", "2", "chimp");
		Stream<String> infinite = Stream.generate(() -> "chimp");
		Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
		System.out.println(list.stream().anyMatch(pred));
		System.out.println(list.stream().allMatch(pred));
		System.out.println(list.stream().noneMatch(pred));
		System.out.println(infinite.anyMatch(pred));
		
		
	}

}
