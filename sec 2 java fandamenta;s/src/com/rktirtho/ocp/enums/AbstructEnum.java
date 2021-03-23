package com.rktirtho.ocp.enums;

public enum AbstructEnum {
	
	
	
	
	
	
	SUMMER("High"){
		@Override
		public void getTime() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void getCloseTime() {
			// TODO Auto-generated method stub
			
		}
	},
	WINTER(""){
		@Override
		public void getCloseTime() {
			// TODO Auto-generated method stub
			
		}
		@Override
		public void getTime() {
			// TODO Auto-generated method stub
			
		}
	};
	
	public abstract void getTime();
	public abstract void getCloseTime();
	
private AbstructEnum(String attendence) {
		
	}
	

}
