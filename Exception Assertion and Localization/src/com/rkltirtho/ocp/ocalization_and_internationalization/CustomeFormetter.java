package com.rkltirtho.ocp.ocalization_and_internationalization;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class CustomeFormetter {

	public static void main(String[] args) {
		double d = 1234567.467;
		
		NumberFormat formate = new DecimalFormat("##,###.##");
		NumberFormat formateZero = new DecimalFormat("000,000.00000");
		NumberFormat formateSign = new DecimalFormat("$##,###.##");
		System.out.println(formate.format(d));
		System.out.println(formateZero.format(d));
		System.out.println(formateSign.format(d));

	}

}
