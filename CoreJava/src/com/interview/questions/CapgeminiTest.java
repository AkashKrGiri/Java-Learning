package com.interview.questions;

public class CapgeminiTest {
	public static void main(String[] args) {
		char ch;
		String s1 = "abcd";
		String s2 = new String("abcd");
		if (s2.equals(s1)) {
			if (s2 == s1)
				ch = s2.charAt(0);
			else
				ch = s2.charAt(1);
		} else {
			if (s2 == s1)
				ch = s2.charAt(2);
			else
				ch = s2.charAt(3);
		}
		System.out.println(ch);

	}

}
