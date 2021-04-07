package com.rkltirtho.ocp.ocalization_and_internationalization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;


public class NumberFormate {

	public static void main(String[] args) {
		Locale local = new Locale("bn_BN");
		Locale localUs = Locale.getDefault();
		System.out.println(NumberFormat.getNumberInstance().format(100000));
		System.out.println(NumberFormat.getCurrencyInstance(local).format(100000));
		System.out.println(NumberFormat.getCurrencyInstance(localUs).format(100000));
		System.out.println(NumberFormat.getPercentInstance(local).format(100000));
		
		System.out.println(NumberFormat.getCurrencyInstance(Locale.UK).format(100000));
		
		
		String s = "40.45";
		var en = NumberFormat.getInstance(Locale.US);
		try {
			System.out.println(en.parse(s));
			var fr = NumberFormat.getInstance(Locale.FRANCE);
			System.out.println(fr.parse(s)); // 40
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // 40.45
		

	}

}
