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
		
		List<String> collection2 = new ArrayList<>();
		collection2.add("Rejaul");
		collection2.add("Kerim");

		System.out.println(collection2);
		collection2.remove(1);
		System.out.println(collection2);
		
		
		
	}

}
