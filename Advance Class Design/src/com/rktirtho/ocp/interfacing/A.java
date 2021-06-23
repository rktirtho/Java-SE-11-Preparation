package com.rktirtho.ocp.interfacing;

public interface A {
	String name();
	default void printInfo() {System.out.println("Interface A");}

}
