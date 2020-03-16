package com.collection.dictionary;
import java.util.Collections;
import java.util.LinkedList;


public class CollectionLinkedList9 {
	public static void main(String[] args)
	{
	LinkedList<String>list = new LinkedList();
	list.add("First");
	list.add("Second");
	list.add("Third");
	System.out.println(list+"\n");
	
	
	Collections.reverse(list);
	for(String s : list)
	{
		System.out.println(s);
	}
	
	Collections.shuffle(list);
	for(String s : list){
		System.out.println(s);
	}
	
	Collections.shuffle(list);
	for(String s : list){
		System.out.println(s);
	}
	}

	

}
