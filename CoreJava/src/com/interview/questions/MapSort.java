package com.interview.questions;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSort {

	
	private static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
		
		List<Map.Entry<String, Integer>> list = new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				 //return (o1.getValue().compareTo(o2.getValue()));
				return (o1.getKey().compareTo(o2.getKey()));
			}

		});
		HashMap<String, Integer> temp = new LinkedHashMap<String, Integer>();
		for (Map.Entry<String, Integer> aa : list) {
			temp.put(aa.getKey(), aa.getValue());
		}
		return temp;

	}
	public static void main(String[] args) {
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Math", 79);
		hm.put("Eng", 88);
		hm.put("Java", 70);
		System.out.println(hm);
		Map<String, Integer> m = sortByValue(hm);
		for (Map.Entry<String, Integer> en : m.entrySet()) {
			System.out.println("key=" + en.getKey() + ", Value= " + en.getValue());
		}
	}


}
