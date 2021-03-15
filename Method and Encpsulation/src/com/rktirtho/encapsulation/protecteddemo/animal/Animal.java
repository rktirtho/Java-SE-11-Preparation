package com.rktirtho.encapsulation.protecteddemo.animal;

public class Animal {
	
	protected String name;

	public Animal(String name) {
		super();
		this.name = name;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}
	
	

}
