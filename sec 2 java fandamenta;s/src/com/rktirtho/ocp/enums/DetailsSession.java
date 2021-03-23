package com.rktirtho.ocp.enums;

public enum DetailsSession {
	Spring("Hign","Child"), Summer("Medium","Child"), Winter("Low","Child"), Rainy("Low","Child");
	private final String expectedVisitors;
	private final String age;
	private DetailsSession(String expectedVisitors, String age) {
		this.expectedVisitors = expectedVisitors;
		this.age = age;
	}
	
	public void expectedVisitors() {
		System.out.println(expectedVisitors);
	}
	

}
