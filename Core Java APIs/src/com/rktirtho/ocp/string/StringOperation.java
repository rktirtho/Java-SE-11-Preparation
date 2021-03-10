package com.rktirtho.ocp.string;

public class StringOperation {
	public static void main(String[] args) {
		String name ="Rejaul Karim Tirtho";
		System.out.println(name.indexOf('a', 6));
		System.out.println(name.substring(7));
		System.out.println(name.substring(7, 12));
		
		String x = "Hello World";
		String z = " Hello World".trim();
		System.out.println(z);
		System.out.println(x==z); // true
		
		System.out.println(name.strip());
	}

}
