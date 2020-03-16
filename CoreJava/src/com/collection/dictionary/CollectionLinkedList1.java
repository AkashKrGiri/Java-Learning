package com.collection.dictionary;
//Collection: AddFirst, AddLast, RemoveFirst, RemoveLast elements in LinkedList

import java.util.LinkedList;
public class CollectionLinkedList1 {
	public static void main(String[] args){
		LinkedList ll= new LinkedList();
		
		ll.add("AAA");
		ll.add("BBB");
		ll.add("CCC");
		ll.add("DDD");
		ll.add("EEE");
		ll.add("FFF");
		ll.add("GGG");
		ll.add("HHH");
		System.out.println(ll);
		
		ll.addFirst("akash");
		System.out.println(ll);
		
		ll.addLast("kumar");
		System.out.println(ll);
		
		ll.removeFirst();
		System.out.println(ll);
		
		
		ll.remove("EEE");
		ll.removeLast();
		System.out.println(ll);
		
	}

}
