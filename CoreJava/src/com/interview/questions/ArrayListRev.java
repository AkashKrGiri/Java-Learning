package com.interview.questions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListRev {
	public static void main(String [] args) {
		ArrayList <Integer> al = new ArrayList<>();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(400);
	//Collections.reverse(al);
		for(int i= al.size()-1; i>=0; i--) {
	System.out.println(al.get(i));
		}

	}

}
