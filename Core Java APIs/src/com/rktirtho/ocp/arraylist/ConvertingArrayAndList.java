package com.rktirtho.ocp.arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertingArrayAndList {
	
	public static void main(String[] args) {
		
		List<String> names =new ArrayList<String>();
		names.add("Chack");
		names.add("Chack");
		// toArray return array of object. type casting  cause of compilation error
		// 
		Object[] nameString = names.toArray();
		// no remove only change
		nameString[0] = "Test";
		
		System.out.println(nameString[0]);
		List<int[]> newNumberArray = Arrays.asList(new int[] {1,2});
		
		// no remove only change
		newNumberArray.remove(0);
		
		// no change no remove
		List.of("one", "two");
		
	}

}
