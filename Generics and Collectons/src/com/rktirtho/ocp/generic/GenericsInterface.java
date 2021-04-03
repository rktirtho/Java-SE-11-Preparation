package com.rktirtho.ocp.generic;

public class GenericsInterface {
public static void main(String[] args) {
	ShipRoboTCrate crate =new ShipRoboTCrate();
}
}

interface Shippable<T>{
	void ship(T t);
}

class Robot{}

class ShipRoboTCrate implements Shippable<Robot>{

	@Override
	public void ship(Robot t) {
		System.out.println(t instanceof Robot ? "Yes":"No");
		
	}
	
}

class ShipRoboTCrateS<T> implements Shippable<T>{

	@Override
	public void ship(T t) {
//		System.out.println(t instanceof T ? "Yes":"No");
		
	}
	
}

