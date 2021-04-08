package com.rktirtho.ocp.concurrency.single_thred;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceDemo {

	public static void main(String[] args) {
		ScheduledExecutorService service = Executors.newSingleThreadScheduledExecutor();
		service.scheduleAtFixedRate(()->System.out.println("Task"), 5, 5, TimeUnit.SECONDS);

//		service.scheduleWithFixedDelay(()->System.out.println("Task Delay")
//				, 5, 5, TimeUnit.SECONDS);
	}

}
