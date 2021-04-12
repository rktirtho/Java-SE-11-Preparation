package com.rktirtho.ocp.enums.constructor;

public enum Season {
	
//	SUMMER, RAINY,SPRING,WINTER;
	SUMMER("LOW"), RAINY("MEDIUM"),SPRING("HIGH"),WINTER("LOW");
	
	
	
//	public static  String expectedVisitors;
	private  String expectedVisitors = "HIGN";
	private Season(String expectedVisitors) {
		this.expectedVisitors=expectedVisitors;
	}
	
	private Season(String expectedVisitors, String s) {
		this.expectedVisitors=expectedVisitors;
	}
	
	public void getVisitors() {
		System.out.println(expectedVisitors);
	}
	

}
