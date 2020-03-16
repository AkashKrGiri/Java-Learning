package com.InterviewQuestion.strings;

import java.util.LinkedList;
import java.util.List;

public class ListColebration {
	public static void main(String[] args) {
		List<String> list1 = new LinkedList<String>();
		list1.add("Akash");
		list1.add("Kumar");
		list1.add("Giri");
		System.out.println(list1);
		List<String> list2 = new LinkedList<String>();
		list2.add("Indian");
		list2.add("Bihar");
		list2.add("Chapra");
		System.out.println(list2);
		
		List<String> list3 = new LinkedList<String>();
		list3.addAll(list1);
		list3.addAll(list2);
		System.out.println(list3);
				
	}

}
