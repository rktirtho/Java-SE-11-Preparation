package com.rktirtho.ocp.files_directories;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CoppyFiles {

	public static void main(String[] args) {
		try {
			Files.copy(Path.of("/home/rktirtho/java-io"),
					Path.of("/home/rktirtho/java-io/system/copy-io"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(Files.exists(Path.of("/home/rktirtho/java-io/besic.txt")));

	}

}
