package com.collection.dictionary;

//Collection: .set(), .clear() operations in ArrayList 

import java.util.ArrayList;


public class CollectionArrayList2 {
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("I hate you");
		al.add("I hate you");
		al.add("I hate you");
		al.add("I hate you");
		al.add("I hate you");
		al.add("I hate you");
		al.add("I hate you");
		System.out.println(al);
		al.set(2,"I love you");
		al.add(4, "hi");
	    System.out.println(al);
		al.clear();
		System.out.println(al);
	}
}
