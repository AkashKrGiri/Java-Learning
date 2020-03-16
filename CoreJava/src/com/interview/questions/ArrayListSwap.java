package com.interview.questions;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSwap {
	public static void main(String[] args) {
		String temp;
		ArrayList<String> al= new ArrayList<>();
		al.add("Red");
		al.add("Black");
		al.add("White");
		al.add("Green");
		Collections.swap(al, 0, 2);
		System.out.println(al);
	}

}
