package com.rktirtho.ocp.abstraction.constructor;

public class Panda extends Bear{
	String chew() {
		return "yummy!";
	}

	public static void main(String[] args) {
		System.out.println("Running");
		Panda panda = new Panda();
		panda.printChew();
	}

}
