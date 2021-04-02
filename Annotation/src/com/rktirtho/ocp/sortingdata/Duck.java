package com.rktirtho.ocp.sortingdata;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Duck implements Comparable<Duck> {
	private String name;

	public Duck(String name) {
		this.name = name;
	}

	public String toString() { // use readable output
		return name;
	}

	@Override
	public int compareTo(Duck d) {
		// TODO Auto-generated method stub
		return name.compareTo(d.name);
	}
	
	public static void main(String[] args) {
		var ducks = new ArrayList<Duck>();
		ducks.add(new Duck("Quack"));
		ducks.add(new Duck("APuddles"));
		ducks.add(new Duck("Puddles"));
		Collections.sort(ducks);
		// sort by name
		System.out.println(ducks); // [Puddles, Quack]
		}

}
