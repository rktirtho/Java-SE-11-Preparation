package com.rktirtho.root;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Employee extends People{
	
	public double getIncome() {
		BiConsumer<String, String> consumer = (final var x, final var y) -> System.out.println(x);
		
		return super.getIncome()*6;
		
		
		
	}

}
