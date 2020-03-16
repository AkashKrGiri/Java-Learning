package com.collection.dictionary;

//Collection:- Using Iterator, clone in ArrayList


import java.util.ArrayList;
import java.util.Iterator;
public class CollectionArrayList4 {
	public static void main(String[] args){
		
		ArrayList al = new ArrayList();
		
		al.add("Bihar");
		al.add("UP");
		al.add("Tamil Nadu");
		al.add("AP");
		System.out.println(al);
		
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		ArrayList<String> copy  = (ArrayList<String>) al.clone();
		System.out.println(copy);
	}

}
