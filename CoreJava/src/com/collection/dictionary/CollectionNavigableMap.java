package com.collection.dictionary;
import java.util.TreeMap;


public class CollectionNavigableMap {
	public static void main(String[] args){
		
		TreeMap<String, String> t = new TreeMap<String, String>();
		t.put("a", "Akash");
		t.put("b", "Binod");
		t.put("c", "cat");
		t.put("e", "elephant");
		t.put("f", "Football");
		System.out.println(t);
		System.out.println(t.ceilingEntry("b"));
		System.out.println(t.floorKey("a"));
		System.out.println(t.higherKey("f"));
		System.out.println(t.lowerKey("e"));
		System.out.println(t.pollFirstEntry());
		System.out.println(t.pollLastEntry());
		System.out.println(t.descendingMap());
		System.out.println(t);
		
		
		
	}

}
