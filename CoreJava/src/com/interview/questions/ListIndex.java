package com.interview.questions;

import java.util.ArrayList;
import java.util.List;

public class ListIndex {
	public static void main(String[] args) {
		List<String> l = new 	ArrayList<String>();
		l.add("One");
		l.add("Two");
		l.add("four");
		l.add("Three");
		l.add("five");
		for(int i=0;i<3;i++) {
			System.out.println(l.get(i));
		}
	}

}
