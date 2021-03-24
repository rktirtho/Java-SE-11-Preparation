package com.rktirtho.ocp.createannotation;

public @interface OcpConfigure {
	// field can not be private of protectd
	// required
	int id();
	// Optional field
	public String massage() default "Required";
	
	public abstract int softness() default 11;
	

}
