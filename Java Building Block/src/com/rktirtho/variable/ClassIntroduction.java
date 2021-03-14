package com.rktirtho.variable;

public class ClassIntroduction {
	int num=20;
	private String firstName;		// Instance Variable
	private String lastName;		// Instance Variable
	
	// Block of Code
	// This block will execut before constructor body execution
	{
		int num=0;
		System.out.println("This block will execut before constructor body execution");
		
	
	}
	{
		
	}
	
	
	// Constructor
	public ClassIntroduction(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}


	// Method
	public String getFirstName() {
		return firstName;
	}

	// Method
	public void setFirstName(String firstName /*Method Parameter*/) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	
	
	

}
