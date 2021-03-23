package com.rktirtho.ocp.innerclasse;

public class StaticInnerClass {
	
	
	public static class Inner{
		protected int price = 6;
		
	}
	
	public static void main(String[] args) {
		Inner inner = new StaticInnerClass.Inner();
		System.out.println(inner.price);
	}

}
