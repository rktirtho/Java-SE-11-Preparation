package com.rktirtho.ocp.path;

import java.io.File;
import java.nio.file.Path;

public class App {
	public static void main(String[] args) {
		Path path = Path.of("/home/rktirtho/Downloads/Profile.pdf");
		for (Path path2 : path) {
			System.out.println(path2.getFileName());
		}
		
		File file =new File("/home/rktirtho/Downloads");
		for (File path2 : file.listFiles()) {
			System.out.println(path2.getName());
		}

	}
	public static String get (String first, String... more, String d) 
	{return null}
}
