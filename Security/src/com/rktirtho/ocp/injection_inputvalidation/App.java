package com.rktirtho.ocp.injection_inputvalidation;

import java.util.Arrays;

public class App {
public static void main(String[] args) {
	int arr[] = {4,74,9};
	
	Arrays.fill(arr, 'c');
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
}
}
