package com.rktirtho.ocp.looping;

import java.util.Scanner;

public class TheWhileLoop {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter number whose factorial u want to find:");
	        int n = sc.nextInt();

	        int count = 0;
	        for (int i = 5; i <= n; i = i * 5) {
	        	System.out.println("i >> "+i);
	        	System.out.println("....."+(n / i));
	            count += n / i; 
	        }

	        System.out.println(count);
	    }

}
