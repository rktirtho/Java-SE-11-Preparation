package com.rktirtho.ocp.enums;

public class EnumWithSwitchCase {
	public static void main(String[] args) {
		
		Session session = Session.Summer;
		session =Session.Spring;
		String sel ="Spring";
		switch (session) {
		case Summer:
			System.out.println("Time so pool");
			break;
			
			case Spring:
				System.out.println("time to wwatch nature");

		default:
			break;
		}
//		System.out.println("Summer"==Session.Summer);

	}
}
