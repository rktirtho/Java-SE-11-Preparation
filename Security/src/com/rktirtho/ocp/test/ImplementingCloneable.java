package com.rktirtho.ocp.test;

import java.util.ArrayList;

public class ImplementingCloneable {
	public static void main(String... args) throws Exception {
		ArrayList<String> food = new ArrayList<>();
		food.add("grass");
		Animal sheep = new Animal();
		Animal clone = (Animal) sheep.clone();
		System.out.println(sheep == clone);
		System.out.println(sheep. == clone.favoriteFoods);
		}
	
	
}
