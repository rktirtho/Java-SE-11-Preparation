package com.rktirtho.ocp.test;

import java.util.ArrayList;
import java.util.List;

public final class Animal implements Cloneable {
	private final ArrayList<String> favoriteFoods;

	public Animal() {
		favoriteFoods = new ArrayList<String>();
		favoriteFoods.add("apple");
	}

	public Animal(ArrayList<String> favFoods) throws NullPointerException {
		if (favFoods == null) {
			throw new NullPointerException();
		}
		favoriteFoods = new ArrayList<String>(favFoods);
//		favoriteFoods.add("apple");
	}

	// method is mutable
	public List<String> getFavoriteFoods() {
		return favoriteFoods;
	}

	// values are immutable by this 2 method
	public int getNumberOfFavFood() {
		return favoriteFoods.size();
	}

	public String favFood(int i) {
		return favoriteFoods.get(i);
	}

	// getting copy of orginal
	public ArrayList<String> getFavoriteFoods(int a /* unnecessay */) {
		return new ArrayList<String>(this.favoriteFoods);
	}
	
	//Cloneable interface
	public static void main(String... args) throws Exception {
		ArrayList<String> food = new ArrayList<>();
		food.add("grass");
		Animal sheep = new Animal(food);
		Animal clone = (Animal) sheep.clone();
		System.out.println(sheep == clone);   // false. cloned object. different
		System.out.println(sheep.favoriteFoods == clone.favoriteFoods);
		}
	
	
	//deep clone
	@Override
	protected Animal clone() throws CloneNotSupportedException {
		ArrayList<String> listClone = (ArrayList) favoriteFoods.clone();
		return new Animal(listClone);
	}
}
