package com.rktirtho.text;

public class StringDemo {
	
	public static void main(String[] args) {
		
/**
 * a , b, c are reffarence of same object. b'coz of their initialization style
 * but though a and a1 has same object but they are refferencing different object. 
 */
		String a = "Hello";
		String b =a;
		String c ="Hello";
		String a1 =new String("Hello");
		System.out.println(a == a1);
		
		// this method return a copy of a1 value. but they are also different objects
		var b2 = a1.intern();
		System.out.println(b2 == a1);
		
		//===========================Various method of String class==========================//
		
		String message = " Hello World ";
		// return another object of value is upper case format
		String c1 = message.toUpperCase();
		
		System.out.println("message = "+ message +" "+ c1);
		
		message.
		
	}

}
