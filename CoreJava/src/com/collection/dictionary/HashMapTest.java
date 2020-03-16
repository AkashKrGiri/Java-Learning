package com.collection.dictionary;

import java.util.HashMap;

public class HashMapTest {
	public static void main (String[] args){
		HashMap <String, Integer> hm= new HashMap();
		hm.put("Akash", 25);
		hm.put("Saurav", 30);
		hm.put("Aman",24);
		hm.put("Akash", 27);
		System.out.println(hm);
	}

}
