package com.rktirtho.ocp.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

public class App {
public static void main(String[] args) {
	String [] chars = {"R", "E", "Z", "A"};
	
	List<String> list = Arrays.asList(chars);
	List<String> listOf = List.of(chars);
	
	System.out.println(list);
	System.out.println(listOf);
//	listOf.add("de"); // runtime exception [UnsupportedOperationException]
	
	chars[2] = "J";
	System.out.println(list);
	System.out.println(listOf);
	
	Supplier<ArrayList<String>> supplier = ArrayList::new;
	
	ArrayList<String> teams = supplier.get();
	teams.add("ARG");
	teams.add("ARG");
	teams.add("BRA");
	teams.add("BAN");
	teams.add("CHI");
	System.out.println(teams);
	teams.add(2, "GER");
	teams.add(2, "GER");
	System.out.println(teams);
	UnaryOperator<String> operator = x -> x.concat("-");
	teams.replaceAll(operator);
	teams.remove("GER-");
	System.out.println(teams);
	
	teams.forEach(System.out::println);
	
	Iterator<String> iterator = teams.iterator();
	
	Function<String, String> consumer = x -> x.concat(",");
	BiFunction<String,String, String> consumers = String::concat;
	
	while(iterator.hasNext()) {
		
//		System.out.print(consumer.apply(iterator.next()));
		System.out.print(consumers.apply(iterator.next(),","));
		}
	System.out.println(teams.get(0).hashCode() == teams.get(1).hashCode());
}
}
