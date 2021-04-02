package com.rktirtho.ocp.queue;

import java.util.LinkedList;
import java.util.Queue;

public class App {
public static void main(String[] args) {
	LinkedList<String> queue = new LinkedList<String>();
	queue.add(0,"d");
	System.out.println(queue.peek());
	System.out.println(queue.peek());
	
	System.out.println(queue.pop());
	System.out.println(queue.peek());
	
}
}
