package com.rktirtho.ocp.building_interface;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ImplementingConsumerAndBiConsumer {
	public static void main(String[] args) {
		// ========Consumer Example ==================
		ArrayList<String> names = new ArrayList<String>();
		Consumer<String> consumer =  names::add;
		consumer.accept("Rejaul Karim");
		consumer.accept("Saeed Al Hasan");
		System.out.println(names);
		
		// ========BiConsumer=========================
		
		Map<String, String> phoneNumbers = new HashMap<String, String>();
		BiConsumer<String, String> biConsumerRef = phoneNumbers::put;
		BiConsumer<String, String> biConsumerLam = (k,v)->phoneNumbers.put(k, v);
		
		biConsumerRef.accept("Zisan", "015478145");
		biConsumerLam.accept("Hasan", "019874844");
		
		System.out.println(phoneNumbers);
		System.out.println(phoneNumbers.entrySet());
	}

}
