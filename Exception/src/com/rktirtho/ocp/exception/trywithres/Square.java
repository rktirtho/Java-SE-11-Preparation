package com.rktirtho.ocp.exception.trywithres;

public class Square {
		private double length;
		public Square(double length) {
			this.length = length;
		}
}

class Cube extends Square {
	public Cube(double length) {
		super(length);
	}
	public double findSurfaceArea() {
		return super.findSurfaceArea() * 6;
	}
}