package com.rktirtho.text;

public class Cube extends Square{
	
	public int calcArea(int x) {
		return super.calcArea(x * 6);
	}

	public static void main(String[] args) {
		Cube shape = new Square();
		System.out.println(shape.calcArea(1));
	}

}

class Square {
	public int calcArea(int x) {
		return (x * x);
	}
}
