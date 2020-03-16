package com.InterviewQuestion.strings;

import java.util.LinkedList;
import java.util.List;

public class ListToArray {
	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		list.add("Akash");
		list.add("Kumar");
		list.add("Giri");
		System.out.println(list);

		String[] arr = list.toArray(new String[0]);
		for (String x : arr) {
			System.out.print(x + " ");

		}

	}

}
