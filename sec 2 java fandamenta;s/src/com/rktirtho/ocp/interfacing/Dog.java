package com.rktirtho.ocp.interfacing;

public class Dog implements Run, Walk{

	@Override
	public void strtMassage() {
		System.out.println("Dog getting prepered");
		
	}

	@Override
	public int seppd() {
		// TODO Auto-generated method stub
		return Run.super.seppd();
	}
	
	void speedCaller() {
		System.out.println(Walk.super.seppd());
	}
	

}
