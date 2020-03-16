package com.collection.dictionary;
//LinkedList:- .size(), .isEmpty(), .contains() operations in LinkedList.

import java.util.LinkedList;

public class CollectionLinkedList2 {
	public static void main(String[] args){
		LinkedList <String> list = new LinkedList<String>();
		list.add("Akash");
		list.add("Kumar");
		list.add("Apple");
	    list.add("Grape");
	    list.add("Banana");
	    System.out.println(list);
	    System.out.println(list.size());
	    System.out.println(list.isEmpty());
	    System.out.println(list.contains("Grape"));
	    System.out.println(list.contains("Giri"));
	
	}
	

}
