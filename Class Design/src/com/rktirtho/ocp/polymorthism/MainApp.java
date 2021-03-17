package com.rktirtho.ocp.polymorthism;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Duck duck = new DinalDuck();
		duck.call();
		
		Duck duck2 =duck;
		duck2.call();

	}

}
