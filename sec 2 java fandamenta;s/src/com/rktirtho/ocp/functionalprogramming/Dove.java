package com.rktirtho.ocp.functionalprogramming;

@FunctionalInterface
public interface Dove {
	
	public String toString();
	public boolean equals(Object o);
	public int hashCode();
	
	
	public void getDove();

}
@FunctionalInterface
 interface Hibernate {
String toString();
public boolean equals(Hibernate o);
public abstract int hashCode();
public void rest();
}