package com.rktirtho.ocp.abstraction.constructor;

public abstract class Bear {
	abstract CharSequence chew();

	public Bear() {
		System.out.println(chew());
	}
	
	public void printChew() {
		System.out.println(chew());
	}
}
