package com.rktirtho.ocp.polymorthism;

class Carnivore {
	protected boolean hasFur = false;
	public String getName() {
		return "Super";
	}
}

public class Meerkat extends Carnivore {
	protected boolean hasFur = true;
	public String getName() {
		return "Sub";
	}

	public static void main(String[] args) {
		Meerkat m = new Meerkat();
		Carnivore c = m;
		System.out.println(m.hasFur);
		System.out.println(m.getName());
		System.out.println(c.hasFur);
		System.out.println(c.getName());
	}
}

 abstract class AbstractDemo{}