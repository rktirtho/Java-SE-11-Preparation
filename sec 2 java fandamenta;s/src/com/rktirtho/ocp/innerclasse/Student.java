package com.rktirtho.ocp.innerclasse;

public class Student {
	
	private String classId= "F565";
	public Student() {
		System.out.println("Student created...");
	
	}
	
	public Address getAddress() {
		return new Address();
	}
	public class Address {
		{
			// inner class can access outclass private field
			System.out.println(classId);
		}
		
		public Address() {
			System.out.println("Affress Created");
		}
		
		void getAddress() {
			System.out.println("Get Address");
		}
		
	}
}
