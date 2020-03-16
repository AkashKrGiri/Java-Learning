package com.collection.dictionary;

import java.util.Comparator;

class MyComparator implements Comparator {

	public int compare(Object obj1, Object obj2) {
		String s1 = obj1.toString();
		String s2 = (String) obj2;

		//return s2.compareTo(s1);
		 return s1.compareTo(s2);

	}
}
