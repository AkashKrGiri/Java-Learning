package com.collection.dictionary;
import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedList3 {
	
	public static void main(String[] args){
		LinkedList<String> list= new LinkedList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		System.out.println(list);
		Iterator<String> itr = list.iterator();
		while(itr.hasNext())
		  {
			System.out.println(itr.next());
		   }
	}
}
