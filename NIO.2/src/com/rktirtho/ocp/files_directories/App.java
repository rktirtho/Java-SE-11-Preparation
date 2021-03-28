package com.rktirtho.ocp.files_directories;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {
public static void main(String[] args) {
	Path path =FileSystems.getDefault().getPath("/home/rktirtho/java-io");
	System.out.println(Files.exists(path));
	try {
		Files.createDirectory(Path.of("/home/rktirtho/java-io/system/create"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
