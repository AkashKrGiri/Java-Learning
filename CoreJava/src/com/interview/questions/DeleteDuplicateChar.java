package com.interview.questions;

import java.util.LinkedHashSet;

public class DeleteDuplicateChar {
	public static void main(String[] args) {
		String str = "javaoppovivovogo";
		LinkedHashSet<Character> lhs = new LinkedHashSet<Character>();
		for (int i = 0; i < str.length(); i++)
			lhs.add(str.charAt(i));
		for (Character cr : lhs)
			System.out.print(cr);

	}

}
