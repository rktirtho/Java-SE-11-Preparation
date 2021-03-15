package com.rktirtho.encapsulation.protecteddemo.birds;

import com.rktirtho.encapsulation.protecteddemo.animal.Animal;

public class Flamingo extends Animal {
	public static String count="";

	public Flamingo(String name) {
		super(name);
		super.name ="";
		
	}
	
	public void swim() {
		Flamingo flamingo = new Flamingo("Nikki");
		setName("df"); //Getting supper class protected method
		flamingo.name = ""; // accessing protected member
		
		Animal animal = new Animal("");
		
	}

}
