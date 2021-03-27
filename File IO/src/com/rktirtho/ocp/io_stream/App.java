package com.rktirtho.ocp.io_stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class App {
	public static void main(String[] args) {
		File file = new File("/home/rktirtho/java-io/besic.txt");
		if (!file.exists()) {
			System.out.println("file is not available");
			return;

		}

		try {
			FileInputStream inputStream = new FileInputStream(file);
			var om = new FileOutputStream("/home/rktirtho/java-io/output-besic.txt");
			int i;

			try {
				while ((i = inputStream.read()) != -1) {
					System.out.print((char)i);

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}

}
