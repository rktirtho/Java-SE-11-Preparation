package com.rktirtho.ocp.generic;

public class GenericsClasses {
public static void main(String[] args) {
	
}
}

class Crate<T>{
	private T contant;
	
	public Crate(T content) {
		this.contant =content;
	}
	
	public T remove(T obj) {
		return obj;
	}
	
	
}
