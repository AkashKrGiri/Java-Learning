package com.collection.dictionary;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSynchronize {

	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(9, "Akash");
		hm.put(4, "Prem");
		hm.put(8, "Ram");
		hm.put(3, "Mohan");
		System.out.println(hm);
		Map map = Collections.synchronizedMap(hm);
		System.out.println(map);
		Set set = map.entrySet();
		
		synchronized(map) {
			Iterator i = set.iterator();
			while(i.hasNext()) {
				Map.Entry me= (Map.Entry) i.next();
				System.out.print(me.getKey()+ ": ");
				System.out.println(me.getValue());
			}
		}

	}

}
