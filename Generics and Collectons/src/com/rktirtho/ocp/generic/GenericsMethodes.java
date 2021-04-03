package com.rktirtho.ocp.generic;

public class GenericsMethodes {
	
	public static void main(String[] args) {
	prepare("Test");
	getSystem(new String("df"));
	
	GenericsMethodes.<String>getSystem("");
	
	
	GenericsMethodes methodes = new GenericsMethodes();
	methodes.<String>getSystemCheck("df");
	}
	public static <T> void prepare(T t) {
		System.out.println("Preparing " + t);
	}

	public static <T> Crate<T> ship(T t) {
		System.out.println("Shipping " + t);
		return new Crate<T>();
	}
	
	static public <T> T getSystem(T t) {
		return t;
	}
	
	public <T> T getSystemCheck(T t) {
		return t;
	}
	
}
