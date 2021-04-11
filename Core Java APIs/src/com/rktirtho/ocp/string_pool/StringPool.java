package com.rktirtho.ocp.string_pool;

public class StringPool {
	public static void main(String[] args) {

		String a = "Hell";
		String b = " Hell";
		String c = b.trim();
		String d = c.intern();
		
		System.out.println(a == b);
		System.out.println(a == c);
		System.out.println(a == d);
	}
}
