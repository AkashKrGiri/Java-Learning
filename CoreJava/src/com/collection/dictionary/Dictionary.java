package com.collection.dictionary;

import java.util.Comparator;
import java.util.TreeSet;

public class Dictionary {

	public static void main(String[] args) {

		/* TreeSet t= new TreeSet(new Comparator); */
		TreeSet t = new TreeSet(new MyComparator());
		t.add("Bikash");
		t.add("Ravi");
		t.add("Akash");
		t.add("Vijay");
		System.out.println(t);

	}

}
