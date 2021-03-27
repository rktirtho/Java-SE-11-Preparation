package com.rktirtho.ocp.ntarection_with_path;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Path;

public class BasicInfo {
public static void main(String[] args) {
	Path path = Path.of("/home/rktirhto/java-io/basic.txt");
	System.out.println(path.toString());
	//return number of directory (number of forward slice)
	System.out.println(path.getNameCount());
	System.out.println(path.getName(2));
	
	System.out.println(path.subpath(0, 2));
	
	System.out.println(path.getFileName());
	System.out.println(path.getParent());
	System.out.println(path.getRoot());
	
	
	System.out.println(path.isAbsolute());
	
	Path path2 = FileSystems.getDefault().getPath("java/file.java");
	System.out.println(path2.toAbsolutePath().isAbsolute());
}
}
