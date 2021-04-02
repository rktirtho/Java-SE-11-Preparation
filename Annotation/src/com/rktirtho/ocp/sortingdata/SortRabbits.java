package com.rktirtho.ocp.sortingdata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortRabbits {
	static class Rabbit{ int id; int getId(){return id;}}
	public static void main(String[] args) {
		
		List<Rabbit> rabbits = new ArrayList<>();
		List<String> rabbitss = new ArrayList<>();
		
		rabbits.add(new Rabbit());
		
		Comparator<Rabbit> comparator = Comparator.comparing(Rabbit::getId);
		
		Collections.sort(rabbits);// DOES NOT COMPILE
		Collections.sort(rabbits, comparator); // COMPILE
		Collections.sort(rabbitss); // COMPILE
		
		}
}
