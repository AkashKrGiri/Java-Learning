package com.collection.dictionary;
//Collection:-  Addition of element in ArrayList by (.add()). 

import java.util.ArrayList;
public class CollectionArrayList1 {
	public static void main (String[] args){
		ArrayList al = new ArrayList();
		al.add("Akash");
		al.add("Kumar");
		al.add("Giri");
		
		System.out.println(al);
		al.remove("Akash");
		System.out.println(al);
		
	}

}
