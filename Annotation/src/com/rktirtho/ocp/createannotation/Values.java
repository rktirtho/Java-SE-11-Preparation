package com.rktirtho.ocp.createannotation;

public @interface Values {
	
	String veterinarian() default "unassigned";
	String value() default "foot";
	int age() default 1;

}
