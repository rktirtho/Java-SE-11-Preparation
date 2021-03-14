package com.rktirtho.ocp.labmdas;


public class LambdasSyntex {
	public static void main(String[] args) {
				
		Adder adder2 = (m,d) -> true;
		adder2.print("reer", "");
		
		Multiplier multiplier = (a,b) ->{
			return mult(a, b);
		}; // without semicolon compilation error
		
		System.out.println(multiplier.mult(20, 8));
		adder(1, mult(4, 85));
		
		
	}
	
	static int adder(int a , int b) {
		return a+b;
	}
	static int mult(int a , int b) {
		return a*b;
	}

}
