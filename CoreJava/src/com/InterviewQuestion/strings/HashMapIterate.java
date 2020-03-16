package com.InterviewQuestion.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterate {
	public static void main(String[] args) {
		HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(60, "AKash");
		hashmap.put(85, "Vkki");
		hashmap.put(53, "Deepak");
		System.out.println(hashmap);
		
		Set entryset = hashmap.entrySet();
		Iterator it = entryset.iterator();
		while (it.hasNext()) {
			
			Entry<Integer, String> entry = (Entry<Integer, String>) it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}

	}

}
