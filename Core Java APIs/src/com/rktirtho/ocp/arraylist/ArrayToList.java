package com.rktirtho.ocp.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		String[] names = new String[] {"Rejaul", "Karim"};
		
		List<String> strings = Arrays.asList(names);
		
		System.out.println(names.toString());
		System.out.println(strings);
		
		
		
		

	}

}
