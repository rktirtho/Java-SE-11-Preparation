package com.rktirtho.ocp.repetable;

import java.lang.annotation.Repeatable;

public @interface Risks {
	Risk[] value();
	

}


@Repeatable(Risks.class)
@interface Risk{
	String danger();
	int level() default 1;
	
}
