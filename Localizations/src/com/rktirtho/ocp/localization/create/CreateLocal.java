package com.rktirtho.ocp.localization.create;

import java.util.Locale;

public class CreateLocal {

	public static void main(String[] args) {
		System.out.println(Locale.getDefault());
		Locale.setDefault(Locale.FRANCE);
		System.out.println(Locale.getDefault());

	}

}
