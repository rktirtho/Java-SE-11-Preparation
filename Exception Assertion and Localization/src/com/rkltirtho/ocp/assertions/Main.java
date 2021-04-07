package com.rkltirtho.ocp.assertions;

import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
		
		if (a==b && b==c && c==a) {
			System.out.println("Equilateral Triangle");
		}else if (a==b || b==c || c==a) {
			System.out.println("Isosceles Triangle");
		}else {
			System.out.println("Bad Triangle");
		}
	}
}


