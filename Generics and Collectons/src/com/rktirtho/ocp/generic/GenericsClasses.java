package com.rktirtho.ocp.generic;
class Cat{String name; String getName() {return this.name;}; Cat(String name){this.name=name;}}
class Lion{String name; Lion(String name){this.name=name;}}
class Elephant{String name; Elephant(String name){this.name=name;}}
public class GenericsClasses {
	public static void main(String[] args) {
		Cat cat =new Cat("TOM");
		Crate<Cat> catCrate = new Crate<>(cat);
		System.out.println(catCrate.getName().getName());

	}
}

class Crate<T> {
	T contant;

	public Crate(T content) {
		this.contant = content;
	}
	
	public Crate() {
	}

	public T remove(T obj) {
		return obj;
	}
	
	public T getName() {
		return contant;
	}

}
