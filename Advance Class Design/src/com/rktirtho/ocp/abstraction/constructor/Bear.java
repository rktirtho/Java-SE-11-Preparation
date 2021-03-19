package com.rktirtho.ocp.abstraction.constructor;

public abstract class Bear extends Animal implements Behaviours{
	abstract CharSequence chew();

	public Bear() {
		System.out.println(chew());
	}
	
	public void printChew() {
		System.out.println(chew());
	}
}
