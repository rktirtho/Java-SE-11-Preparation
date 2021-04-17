package com.rktirtho.ocp.interfacing;

public interface B {

	String name();
	default void printInfo() {System.out.println("Interface B");}

}
