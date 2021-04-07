package com.rktirtho.ocp.custom_exceptions;

public class AddingConstructor extends Exception{
	public AddingConstructor() {
	}
	
	public AddingConstructor(Exception e) {
		super(e);
	}
	
	public AddingConstructor(String message) {
		super(message);
	}
	

}
