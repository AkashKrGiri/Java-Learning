package com.interview.questions;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class HashSetMax {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		
		hs.add("1234");
		hs.add("123456");
		hs.add("12345678");
		Object obj = Collections.max(hs);
		System.out.println(obj);
	}

}
