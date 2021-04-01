package com.rktirtho.ocp.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

public class App {

	public static void main(String[] args) {

		ArrayList<String> collection =new ArrayList<String>();
		collection.add(0,"Rejaul");
		collection.add(1,"Rejaul");
		boolean a=collection.contains("Rejaul");
		collection.removeIf(s -> s.startsWith("R"));
		
		System.out.println(collection);
		
		LinkedList<String> linkedList =new LinkedList<String>();
		linkedList.add("Karim");
//		linkedList.re
		
		List<Integer> collection2 = new ArrayList<Integer>();
		collection2.add(4);

		System.out.println(collection2);
		collection2.remove(4);
		System.out.println(collection2);
		
		
		
	}

}
