package com.rktirtho.ocp.ntarection_with_path;

import java.nio.file.Path;

public class RelativisePath {
public static void main(String[] args) {
	var path1 = Path.of("fish.txt");
	var path2 = Path.of("friendly/birds.txt");
	System.out.println(path1.relativize(path2));
	System.out.println(path2.relativize(path1).toString());
}
}
