package com.collection.dictionary;

//CollectionLinkedList:- .clear() operation in CollectionLinkedList.


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CollectionLinkedList6 
  {
	public static void main(String[] args)
	{
	LinkedList<String>list = new LinkedList();
	list.add("First");
	list.add("Second");
	list.add("Third");
	System.out.println(list);
	
	//How to find does LinkedList contains all list elements or not ?
    
	List<String> l = new ArrayList<String>();
    l.add("First");
    System.out.println("does contains or not ?" +list.containsAll(l));
    l.add("Akash");
	System.out.println("Does contains or not ?" +list.containsAll(l));
	
	//How to get sub list from LinkedList?
	List<String> l1= list.subList(0,1);
	System.out.println(l1);
	
	list.clear();
	System.out.println(list);
	}
  }
