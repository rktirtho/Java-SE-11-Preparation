package com.rktirtho.ocp.ntarection_with_path;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathNormalize {
	public static void main(String[] args) throws IOException {
		Path path = FileSystems.getDefault().getPath("user/rktirtho/../robi");
		System.out.println(path);
		System.out.println(path.normalize());
		
		File d = path.toFile();
		
		
//		System.out.println(Paths.get("/zebra/food.txt").toRealPath());
//		System.out.println(Paths.get(".././food.txt").toRealPath());
	}

}
