package com.InterviewQuestion.strings;

import java.util.Scanner;
//Word count 
public class CharCount {
	public static void main(String[] args) {
		//String s= "Welcome in India";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your String ");
		String s= sc.nextLine();
		 int count = 1;
		 
		 for(int i=0; i<s.length()-1; i++) {
			 if((s.charAt(i)== ' ')&&(s.charAt(i+1)!= ' ')) {
				 count++;
			 }
		 }
		 System.out.println("Number of words in a String " +count);
		
	}

}
