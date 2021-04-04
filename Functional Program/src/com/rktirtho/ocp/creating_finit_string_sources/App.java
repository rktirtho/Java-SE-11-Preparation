package com.rktirtho.ocp.creating_finit_string_sources;

import java.util.List;
import java.util.stream.Stream;

public class App {
	public static void main(String[] args) {
		Stream<String> stream1 = Stream.empty();
		System.out.println(stream1.count());
		
		Stream<Integer> singleElement = Stream.of(1);
		Stream<Integer> fromArray = Stream.of(1, 2, 3);
		
		var numList = List.of(20,41,5,51,55);
		var numStreem = numList.stream();
		Stream<Integer> fromListParallel = numList.parallelStream();
	}

}
