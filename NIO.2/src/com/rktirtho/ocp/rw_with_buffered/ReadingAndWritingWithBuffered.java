package com.rktirtho.ocp.rw_with_buffered;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadingAndWritingWithBuffered {
	public static void main(String[] args) {
		try {
			System.out.println(Files.size(Path.of("/home/rktirtho/java-io")));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try(var reader = Files.newBufferedReader(Path.of("/home/rktirtho/jva-io"))){
			
			String lines ;
			
			while((lines=reader.readLine())!=null) {
				
			}
		}catch (Exception e) {
			// TODO: handle exception
		}

	}
}
