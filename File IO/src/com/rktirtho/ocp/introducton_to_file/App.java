package com.rktirtho.ocp.introducton_to_file;

import java.io.File;

public class App {
	public static void main(String[] args) {
		System.out.println(System.getProperty("file.separator"));
		
		var zooFile1 = new File("/home/java-io","/data/stripes.txt");
		System.out.println(zooFile1.exists()); // true if the file exists
		var status = zooFile1.canRead();
		System.out.println(status);
		
		var fileName = zooFile1.getName();
		System.out.println(fileName);
		System.out.println(zooFile1.getParent());
	}

}
