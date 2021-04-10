package com.rktirtho.ocp.concurrency.concurrent_collection;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHasMapExample {

	public static void main(String[] args) {

		Map<String, Integer> users= new ConcurrentHashMap();
		System.out.println(users.put("rktirtho", 20));
		users.put("elephant", 10);

	}

}
