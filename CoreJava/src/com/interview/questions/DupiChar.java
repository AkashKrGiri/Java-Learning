package com.interview.questions;


public class DupiChar {
	public static void main(String[] args) {
		String str = "empaaloyee";
		countRepeatedChar(str);

	}

	private static void countRepeatedChar(String str) {

		int len = str.length();

		int counter[] = new int[256];
		for (int i = 0; i < len; i++)
			counter[str.charAt(i)]++;

		char[] arr = new char[str.length()];
		for (int i = 0; i < len; i++) {
			arr[i] = str.charAt(i);

			int flag = 0;
			for (int j = 0; j <= i; j++) 
				if (str.charAt(i) == arr[j]) {
					flag++;
				}
				if (flag == 2)
					System.out.println(str.charAt(i) + " " + counter[str.charAt(i)]);
			}
	}

}
/*
 * char[]ch=str.toCharArray(); HashMap<Character,Integer> hmap=new HashMap<>();
 * 
 * for(int i=0;i<ch.length;i++) { if(hmap.get(ch[i])!=null) { hmap.put(ch[i],
 * hmap.get(ch[i])+1); }else { hmap.put(ch[i], 1); } }
 * 
 * for(Character chr:hmap.keySet()) { if(hmap.get(chr)>1) {
 * System.out.println(chr); } }
 */
