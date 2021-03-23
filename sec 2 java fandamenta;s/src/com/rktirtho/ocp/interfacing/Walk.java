package com.rktirtho.ocp.interfacing;

public interface Walk {
	
	void strtMassage();
	
	default int seppd() {
		return 10;
	}
	
	static void instance() {
		printLog();
	}
	
	private int getOil() {
		printLog();
		return 3;
	}
	
	private static void printLog() {
		System.out.println("Walk class");
	}
	
	

}
