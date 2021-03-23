package com.rktirtho.ocp.innerclasse;

public class ClassA {
	
	public void printInfo() {
		System.out.println("class A");
	}
	
	int number =20;
	
	class B{
		int number = 30;
		
		class C{
			int number = 40;
			
			public C() {
			System.out.println(number); 					// This class number 40
			System.out.println(this.number);				// also this class number 40
			System.out.println(B.this.number);				// B Class number 30
			System.out.println(C.this.number);				// C Class means this class number 40
			System.out.println(ClassA.this.number);
			} 
		}
	}

}
