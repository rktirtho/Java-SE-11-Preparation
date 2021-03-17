package com.rktirtho.ocp.methodhidden;

class Marsupial {
	protected int age = 2;

	public static boolean isBiped() {
		return false;
	}
}
//Carefully read this code
public class Kangaroo extends Marsupial {
	protected int age = 6;

	public static boolean isBiped() {
		return true;
	}

	public static void main(String[] args) {
		Kangaroo joey = new Kangaroo();
		Marsupial moey = joey;
		System.out.println(joey.isBiped());
		System.out.println(moey.isBiped());
		System.out.println(joey.age);
		System.out.println(moey.age);
		
		// remember that, static member is class label property
		// when you creating reference, then ta property will be done
	}
}