package com.rktirtho.ocp.innerclasse;

import com.rktirtho.ocp.innerclasse.Student.Address;

public class Main {
	public static void main(String[] args) {
		
		Student student = new Student();
		
		Address address = student.new Address();
		Address address3 = student.getAddress();
		
		
		
	}

}
