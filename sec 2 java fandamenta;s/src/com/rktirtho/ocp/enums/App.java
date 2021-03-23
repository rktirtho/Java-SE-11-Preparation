package com.rktirtho.ocp.enums;

public class App {

	public static void main(String[] args) {
//		System.out.println(Session.Rainy);
		
		for (Session session : Session.values()) {
			System.out.println(session + " "+ session.ordinal());
			
		}
		
		System.out.println(Session.values()[2]);
		
		DetailsSession detailsSession = DetailsSession.Rainy;
		
		System.out.println(detailsSession);
		detailsSession.expectedVisitors();

	}

}
