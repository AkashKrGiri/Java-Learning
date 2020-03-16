package com.collection.dictionary;
//Collection:- .swap() operation in ArrayList

import java.util.ArrayList;
import java.util.Collections;


public class CollectionArrayList9 {

	public static void main(String[] args){
		ArrayList<String> al = new ArrayList<String>();
		al.add("Akash");
		al.add("India");
		al.add("Giri");
		al.add("Bihar");
		al.add("Chapra");
		al.add("Kumar");
		
		System.out.println(al);
		Collections.swap(al, 1, 5);
		System.out.println(al);
		
		
	}
}

/*o/p:-
[Akash, India, Giri, Bihar, Chapra, Kumar]
[Akash, Kumar, Giri, Bihar, Chapra, India]
*/