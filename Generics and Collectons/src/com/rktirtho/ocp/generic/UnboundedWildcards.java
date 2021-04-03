package com.rktirtho.ocp.generic;

import java.util.ArrayList;
import java.util.List;

public class UnboundedWildcards {

	public static void main(String[] args) {
		//public static void main(String[] args) {
		List<String> keywords = new ArrayList<>();
		List<Object> keywordsList = new ArrayList<>();
		keywords.add("java");
		printList(keywords);
		printList(keywordsList);
		

	}
	public static <T> void printList(List<?> list){
		for (Object object : list) {
			System.out.println(object);
		}
		
	}

}
