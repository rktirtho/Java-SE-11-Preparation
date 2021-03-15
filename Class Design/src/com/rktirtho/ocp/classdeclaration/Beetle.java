package com.rktirtho.ocp.classdeclaration;

public class Beetle extends Insect {
	protected int numberOfLegs = 6;
	short age = 3;
	public void printData() {
	System.out.print(this.label);
	System.out.print(super.label);
	System.out.print(this.age);
	System.out.print(this.food);
//	System.out.print(super.age);
	System.out.print(numberOfLegs);
	}
	public static void main(String []n) {
	new Beetle().printData();
	}
}
