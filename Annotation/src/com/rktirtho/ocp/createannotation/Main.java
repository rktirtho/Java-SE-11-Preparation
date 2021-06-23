package com.rktirtho.ocp.createannotation;

public class Main {
	public static void main(String[] args) {
		for (Planet p : Planet.values()) {
			System.out.println(p.getDistace());
		}
	}
}

 abstract class testClass {
	double taxRate = 0.05;
	public void increaseTax() {
		taxRate = taxRate + 0.01;
	}
}
  interface TestInterface {
		double taxRate = 0.05;
		void increaseTax();
	}

   interface TestInterfaces {
		double taxRate = 0.05;
		default void increaseTax() {
			taxRate = taxRate + 0.01;
		}
	}
   
   class Square {
		private double length;
		public Square(double length) {
			this.length = length;
		}
   
   class Cube extends Square {
		public Cube(double length) {
			super(length);
		}
		public double findSurfaceArea() {
			return super.findSurfaceArea() * 6;
		}
	}