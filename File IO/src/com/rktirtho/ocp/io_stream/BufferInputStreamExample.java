package com.rktirtho.ocp.io_stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferInputStreamExample {
	public static void main(String[] args) {
		var src = new File("/home/rktirtho/java-io/besic.txt");
		var dest = new File("/home/rktirtho/java-io/copy with buffer.txt");
		
		try {
			copyWithBuffer(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	static void copyWithBuffer(File src, File dest) throws IOException{
		try(var bufferInput = new BufferedInputStream(
				new FileInputStream(src)
				);
		var bufferOutput = new BufferedOutputStream(
				new FileOutputStream(dest))){
			
			var buffer = new byte [1024];
			int i;
			while ((i=bufferInput.read(buffer))!=-1) {
				bufferOutput.write(buffer, 0 , i);
				
			}
			
		}
	}

}
