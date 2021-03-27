package com.rktirtho.ocp.path;

import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;

public class SomeEnum {
public static void main(String[] args) {
	Path path = Path.of("");
	
	boolean exists = Files.exists(path, LinkOption.NOFOLLOW_LINKS);
}
}
