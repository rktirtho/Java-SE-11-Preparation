package com.rktirtho.ocp.conditions;

public class IfStatements {
	
	public static void main(String[] args) {
		var counter = 50;
		boolean flag = false;
		
		// half circuit and full circuit operation allow in else if condition
		if (flag && counter++ ==100) {
			System.out.println(counter);
		}
		System.out.println(counter);
		
		short v1 = 23;
		short v2 = 20;
		// any arithmatical operation of short and byte types return integer type data
//		short res = v1+v1;
		
	}
	
	

}
