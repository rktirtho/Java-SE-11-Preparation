package com.rktirtho.ocp.io_stream;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BuffredReaderExample {
	public static void main(String[] args) {
		var src = new File("/home/rktirtho/java-io/lorem.txt");
		var dest = new File("/home/rktirtho/java-io/copy with buffer.txt");

		try (BufferedReader reader = new BufferedReader(new FileReader(src))) {

			String line;

			while ((line = reader.readLine()) != null) {
				System.out.println(1);
				System.out.println(line);
			}

		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.write(Integer.valueOf("4667"));

	}

}
