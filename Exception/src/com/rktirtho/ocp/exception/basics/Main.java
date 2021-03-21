package com.rktirtho.ocp.exception.basics;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		float s= 2/30;
		try {
			fall(5);
			throw new ArrayIndexOutOfBoundsException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	static public void fall(int distance) throws IOException {
		if (distance > 10) {
			throw new IOException("Numbr should be less then 10");
		}
		System.out.println("Have a exception");
	}

}
