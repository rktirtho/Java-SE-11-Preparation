package com.rktirtho.variable;

public class Student {
	// instance variable or global variable
	// every primitive types has defaults value
	private int id;
	private String firstName;
	private String lastName;
	private String email;
	// class variable
	// primitive types has default value and reffarance types defaults value is null
	public static int countryCode;
	
	
	//that section will run when object will initialized;
	{
		System.out.println(firstName+" "+ lastName);
	}
	
	// variable type 'var' is not allow as method parameters
	public Student(String fistName, String lastName, String email) {
		
		// this section will execute after field block execution
		this.firstName = fistName;
		this.lastName = lastName;
		this.email = email;
		
		// TODO Auto-generated constructor stub
	}
	
	

}
