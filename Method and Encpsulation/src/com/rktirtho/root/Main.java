package com.rktirtho.root;

import com.rktirtho.encapsulation.protecteddemo.animal.Animal;

public class Main extends Animal{
	public Main(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}
	
	public void printInfo() {
		getName();
		name = "" ;
	}

	public static void main(String[] args) {
		Animal animal = new Animal("");
//		main.getName(); // unable to getting protected member
	}

}
