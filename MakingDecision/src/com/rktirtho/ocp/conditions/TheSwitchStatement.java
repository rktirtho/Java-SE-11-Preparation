package com.rktirtho.ocp.conditions;

public class TheSwitchStatement {
	// Default block is optional
	//
	public static void main(String[] args) {

		// case is also optional in switch statements
		switch (1) {

		}

		// switch can use 6 data types and also their wrapper class
		// variable to be test could be final or non final
		// but case value must be final on compile time  
		//     method final parameter is not run time constant
		//     thats why is can not be value of switch case
		
		Integer number = Integer.valueOf(200);
		switch (number) {
		case 30:

			break;

		default:
			break;
		}

		// Default block could be anywhere among case
		// if any case match then default block does not executed.

		int dayOfWeek = 5;
		switch (dayOfWeek) {
		default:
			System.out.println("Weekday");
			break;
		case 0:
			System.out.println("Sunday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		}

		// if there is no break, all block will be executed which are lower line of
		// matched case

		switch (++dayOfWeek) {
		case 6:
			System.out.println("case match; break ");

		default:
			System.out.println("default case");
			break;
		}

		
		// if any case match then default section will not 
		switch (++dayOfWeek) {
		case 0:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("Weekday");

		case 7:
			System.out.println("Saturday");
			break;
		}
		
		
		short value=4;
		final int sm = 30;
		// this value can no compiled to short
		final int numericPromition =10_000_00;
		switch (value) {
		case sm:
//		case numericPromition:  ==> Compilation error
			
			break;

		default:
			break;
		}
		
		short size = 4;
		final int small = 15;
		final int big = 1_000_000;
		switch(size) {
		case small:
		case 1+2 :
//		case big: // DOES NOT COMPILE
		}

	}

}
