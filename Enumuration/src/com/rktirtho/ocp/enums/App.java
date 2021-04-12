package com.rktirtho.ocp.enums;

public class App {

	public static void main(String[] args) {
		System.out.println(Session.RAINY);  // RAINY
		
		String sesson = "RAINY";
		
//		System.out.println(sesson == Session.RAINY); // DOES NOT COMPILE
		
		for (Session session : Session.values()) {
			System.out.println(session);
		}
		for (Session session : Session.values()) {
			System.out.println(session.ordinal());
		}

	}

}
