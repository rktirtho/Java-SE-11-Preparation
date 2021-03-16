package com.rktirtho.ocp.constructordec;

public class Elephent extends Mammal{

	public final String name;
	public Elephent(int a) {
		super(a);
		this.name ="";
	}
	public Elephent(int a,String name) {
		super(a);
		this.name =name;
	}
	
	public void printInfo() {}

}
