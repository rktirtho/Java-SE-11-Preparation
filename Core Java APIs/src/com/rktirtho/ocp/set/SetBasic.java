package com.rktirtho.ocp.set;

import java.util.HashSet;
import java.util.Set;

public class SetBasic {
	public static void main(String[] args) {
		Set<String> numberSet = new HashSet<String>();
		numberSet.add("4");
		numberSet.remove("4");
		numberSet.add("40");
		
		
		for (String string : numberSet) {
			System.out.println(string);
		}
	}

}
