package com.collection.dictionary;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class CollectionLinkedList5 
  {
	public static void main(String[] args)
	{
	LinkedList<String>list = new LinkedList();
	list.add("First");
	list.add("Second");
	list.add("Third");
	System.out.println(list);
	
	List<String> l = new ArrayList();
	l.add("Fourth");
	l.add("Fifth");
	list.addAll(l);
	System.out.println(list);
	

   }
}
