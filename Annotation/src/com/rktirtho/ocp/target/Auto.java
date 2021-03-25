package com.rktirtho.ocp.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({
	ElementType.TYPE_USE, 
	ElementType.PARAMETER,
	ElementType.FIELD, 
	ElementType.CONSTRUCTOR })
public @interface Auto {

}
