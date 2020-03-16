package com.collection.dictionary;

import java.util.LinkedList;

public class CollectionLinkedList4 {
	public static void main(String[] args){
		
		LinkedList<String> list = new LinkedList<String>() ;
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Random");
		System.out.println("Actual LinkedList:-" +list);
		LinkedList<String> copy= (LinkedList<String>) list.clone();
		System.out.println("Cloneed LinkedList:" +copy);
		
	}
}