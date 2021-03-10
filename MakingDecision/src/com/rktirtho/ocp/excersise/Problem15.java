package com.rktirtho.ocp.excersise;



public class Problem15 {
	public static void main(String[] args) {
		int height = 1;
		
		
		L1: while(height++ <10) {
				long humidity = 12;
		
		L2: do {
		
		if(humidity-- % 12 == 0) {break;}
		
		int temperature = 30;
		
		L3: for( ; ; ) {
		
		temperature++;
		
		if(temperature>50) {}
		
		}
		
	} while (humidity > 4);
		 }
		System.out.println("fd");
	}

}
