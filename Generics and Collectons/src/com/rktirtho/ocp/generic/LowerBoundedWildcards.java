package com.rktirtho.ocp.generic;

import java.util.ArrayList;
import java.util.List;

import com.rktirtho.ocp.generic.UpperBoundedWildcards.Bird;
import com.rktirtho.ocp.generic.UpperBoundedWildcards.Sparrow;

public class LowerBoundedWildcards {

	public static void main(String[] args) {
List<? extends Number> numList = new ArrayList<Integer>();
		
		
		List<? super Bird> birds = new ArrayList<Bird>();
		birds.add(new Bird());
		birds.add(new Sparrow());
		
		List<? super Sparrow> sparrows = new ArrayList<Sparrow>();
//		sparrows.add(new Bird());   Compilation Error
		sparrows.add(new Sparrow());
		

	}

}
