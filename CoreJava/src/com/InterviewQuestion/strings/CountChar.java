package com.InterviewQuestion.strings;

public class CountChar {

	public static void counteachchar(String str) {
		
		int counter[] = new int[256];
		int len = str.length();
		
		for (int i = 0; i < len; i++) 
			counter[str.charAt(i)]++;
			
		
			char[] arr = new char[str.length()];
			for (int i = 0; i < len; i++) {
				arr[i] = str.charAt(i);
				
				
				
			int flag = 0;
			for (int j = 0; j<= i; j++) {
				if (str.charAt(i) == arr[j])
					flag++;
				
			}
			if (flag == 1)

				System.out.println("Char is " +str.charAt(i)+ " and it came " + counter[str.charAt(i)] + " times");

			}

	}

	public static void main(String[] args) {
		String str = "empaaloyee";
		counteachchar(str);

	}

}
