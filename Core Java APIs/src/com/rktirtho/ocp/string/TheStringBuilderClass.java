package com.rktirtho.ocp.string;

import java.util.Scanner;

public class TheStringBuilderClass {
	
	public static void main(String[] args) {
	Scanner scanner =new Scanner(System.in);
	

		StringBuilder builder =new StringBuilder();
		String m = "The end";
		builder.append("The end");
//		String message = builder;				//Compilation error
		System.out.println(builder);
		System.out.println(m==builder.toString());
		

	}
}
