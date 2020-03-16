
//1) Write a java program to find the duplicate words 
//   and their number of occurrences in a string?
package com.InterviewQuestion.strings;

import java.util.HashMap;
import java.util.Scanner;

public class DuplicateWordsInString {
	public static void main(String[] args) {
		String input;
		//get the String from user
		System.out.println("Enter the Strings ");
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextLine();
		//split the String and store in "words"
		String[] words = input.split("");
		//store the words in map
		HashMap<String, String> wordMap = new HashMap<String, String>();
		
		for(int i=0; i<words.length; i++) {
			
			String word = words[i].toLowerCase();
			if(wordMap.get(word)!=null) {
				System.out.println("Duplicate Char = "+word);			
			}else
				wordMap.put(word, word);
		}

	}

}
