package com.rktirtho.ocp.operator.basic;

public class BasicOperators {
	public static void main(String[] args) {
//		float a =4.3;
		long goat = 10;
		int sheep = 5;
		sheep *= goat;
		if(5==5.0) {
			
		}
		
		System.out.print(null instanceof Object);
		Object noObjectHere = null;
		System.out.print(noObjectHere instanceof String);
		int stripes=20;
		var  animal = (stripes < 9) ? 3 : "Horse";
		
		int x=5;
		float y =5.0f;
		if (x==y) {
			
		}
		
		int sheep2 = 1;
		int zzz = 1;
		int sleep2 = zzz<10 ? sheep++ : zzz++;
		// DOES NOT COMPILE
		// DOES NOT COMPILE
		// DOES NOT COMPILE
	}

}
