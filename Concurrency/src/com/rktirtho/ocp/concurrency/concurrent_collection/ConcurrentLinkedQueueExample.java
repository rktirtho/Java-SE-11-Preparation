package com.rktirtho.ocp.concurrency.concurrent_collection;

import java.util.Collections;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class ConcurrentLinkedQueueExample {

	public static void main(String[] args) {
		Queue<Integer> integers = new ConcurrentLinkedQueue<Integer>();
		
		System.out.println(integers.offer(50));
		System.out.println(integers.poll());
		System.out.println(integers.poll());

	}

}
