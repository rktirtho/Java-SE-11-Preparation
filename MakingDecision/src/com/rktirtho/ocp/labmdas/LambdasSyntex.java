package com.rktirtho.ocp.labmdas;


public class LambdasSyntex {
	public static void main(String[] args) {
		Adder adder = new Adder() {
			
			@Override
			public void print() {
				System.out.println("I am from simple implementation");
				
			}
		};
		adder.print();
		
		Adder adder2 = () -> System.out.println("I am printing from lambda expression");
		adder2.print();
	}

}
