package com.collection.dictionary;
//Collection:- .subList() operation in ArrayList

import java.util.ArrayList;
import java.util.List;


public class CollectionArrayList5 {
	public static void main(String[] args){
		ArrayList al = new ArrayList();
		al.add("Bihar");
		al.add("UP");
		al.add("Tamil Nadu");
		al.add("AP");
		al.add("Goa");
		al.add("Pondy");
		al.add("Jharkhand");
		System.out.println(al);
		List<String> list= al.subList(2,6);
		System.out.println(list);
		
	}

}
