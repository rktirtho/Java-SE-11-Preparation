package com.rktirtho.ocp.io_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileWithFileInputeStream {
	public static void main(String[] args) {
		File source = new File("/home/rktirtho/java-io/besic.txt");
		File dest = new File("/home/rktirtho/java-io/copy-besic.txt");

		try {
			copyFile(source, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	static void copyFile(File src, File dest) throws IOException {
		try (var in = new FileInputStream(src); 
				var out = new FileOutputStream(dest)) {
			int b;
			while ((b = in.read()) != -1) {
				out.write(b);
			}
		}
	}
}
