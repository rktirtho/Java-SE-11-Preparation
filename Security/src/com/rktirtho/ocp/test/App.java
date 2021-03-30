package com.rktirtho.ocp.test;

import java.util.Arrays;
import java.util.List;

public class App {
public static void main(String[] args) {
	Animal animal = new Animal();
	
	
	List<String> myList =  animal.getFavoriteFoods(0);
	myList.set(0, "tommatoo");
	System.out.println(myList.get(0));
	System.out.println(animal.getFavoriteFoods().get(0));
	
	
	
}
}
