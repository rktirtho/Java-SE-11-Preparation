package com.rktirtho.encapsulation.protecteddemo.birds;

import com.rktirtho.encapsulation.protecteddemo.animal.Animal;

public class Goose {
	public final int val;
	{
		val=20;
	}
	public static void main(String[] args) {
		
		
		Animal animal = new Animal("Chow");
//		animal.getName();     // protected member does not found 
		Flamingo flamingo= new Flamingo("");
//		flamingo.getName();  functon not found
		
		Flamingo flamingo2 = null;
		String an = flamingo2.count;
		
	}
	
	public void setVal(int a) {
		
	}
public void setVal(int... a) {
		
	}

}
