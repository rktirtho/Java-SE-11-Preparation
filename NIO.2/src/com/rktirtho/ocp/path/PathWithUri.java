package com.rktirtho.ocp.path;

import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathWithUri {
	public static void main(String[] args) {
		try {
			URI uri = new URI("");
			Path path = Path.of(uri);
			Path path1= Paths.get(uri);
			URI u = path.toUri();
		} catch (URISyntaxException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
