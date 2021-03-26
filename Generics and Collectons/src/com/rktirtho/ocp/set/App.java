package com.rktirtho.ocp.set;

import java.util.Set;
import java.util.TreeSet;

public class App {
	public static void main(String[] args) {
		Set<String> animals = 
				//Hence of method does not allow to remove element, thats
				// thats why duplicate value is cause of Illegal Argument exc
				Set.of("Lion", "Elephent", "Panda", "Tiger");
		for (String string : animals) {
			System.out.println(string);
		}
		
		TreeSet<String> animalsTree = new TreeSet<String>();
		animalsTree.add("Tiger");
		animalsTree.add("Panda");
		animalsTree.add("Bear");
		animalsTree.add("Elephant");
		for (String string : animalsTree) {
			System.out.println(string);
		}
		
	}

}
