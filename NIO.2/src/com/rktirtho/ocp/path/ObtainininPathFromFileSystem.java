package com.rktirtho.ocp.path;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class ObtainininPathFromFileSystem {
	public static void main(String[] args) {
		// Connection to Local file System
		Path path = FileSystems.getDefault().getPath("");
		
		// Connecting to Remote File System 
		
		try {
			FileSystem remotePath = FileSystems.getFileSystem(
					new URI("")
					);
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
