package com.rktirtho.ocp.generic;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundedWildcards {

	public static void main(String[] args) {
//		List<Number> numList = new ArrayList<Integer>();  Do Not Compile
		
		List<? extends Number> numList = new ArrayList<Integer>();
		
//		==================Problem could be solved with lower bound=========
		List<? extends Bird> birds = new ArrayList<Bird>();
		birds.add(new Bird());
		birds.add(new Sparrow());
		
		List<? extends Bird> sparrows = new ArrayList<Sparrow>();
		sparrows.add(new Bird());
		sparrows.add(new Sparrow());
		

	}
	
	static class Sparrow extends Bird { }
	static class Bird { }

}
