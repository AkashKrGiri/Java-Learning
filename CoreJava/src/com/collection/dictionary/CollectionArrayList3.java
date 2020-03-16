package com.collection.dictionary;
//Collection: .remove(), .get(), .contains(), .indexOf(), .size(), .isEmpty() operations in ArrayList 

import java.util.ArrayList;
public class CollectionArrayList3 {
	public static void main(String[] args)
	{
		ArrayList al = new ArrayList();
		al.add("AKash");
		al.add("Kumar");
		al.add("Giri");
		al.add("Bihar");
		System.out.println(al);                  //[AKash, Kumar, Giri, Bihar]
		al.addAll(2, al);
		System.out.println(al);                  //[AKash, Kumar, AKash, Kumar, Giri, Bihar, Giri, Bihar]
	    al.remove(1);
	    System.out.println(al);                  //[AKash, AKash, Kumar, Giri, Bihar, Giri, Bihar]
	    //al.get(2);
	    System.out.println(al.get(3));           // Giri
	    System.out.println(al.contains("Giri")); // true :- Here .contains() methods return true value because "Giri" is present in List. 
	    System.out.println(al.contains("Vijay"));// false:- Here .contains() methods return false value because "Vijay" is not present in List. 
	    System.out.println(al.indexOf("Bihar")); // 4
	    System.out.println(al.size());           // 7
	    System.out.println(al.isEmpty());        // false
	}
	

}
