package com.rktirtho.ocp.exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;


public class Exceptions {
	
	public static void main(String[] args) {
		
		
		File file = new File(""); 
		
		try {
			InputStream stream = new FileInputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}catch (IOException e) {
			// TODO: handle exception
		}
		
		
		try {
			open();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
			close();
		
	}
	public static void open()throws Exception{}
	public static void close()throws RuntimeException{
		
	}

}
