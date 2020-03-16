package com.interview.questions;

import java.util.ArrayList;

public class ArrayListMarge {
	public static void main(String[] args) {
		ArrayList<String> c1= new ArrayList<String>();
		c1.add("Red");
		c1.add("Green");
		c1.add("Blue");
		c1.add("White");
		//System.out.println(c1);
		
		ArrayList<String> c2= new ArrayList<String>(c1);
		c2.add("Red");
		c2.add("White");
		c2.add("Black");
		c2.add("Pink");
		//System.out.println(c2);
		ArrayList<String> c3 = new ArrayList<>(c2);
		//c3.addAll(c1);
		//c3.addAll(c2);
		System.out.println(c3);
		

		
	}
	
}
