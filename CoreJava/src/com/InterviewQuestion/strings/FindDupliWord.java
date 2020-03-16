package com.InterviewQuestion.strings;

public class FindDupliWord {
	public static void main(String[] args) {
		String string = "Akash kumar giri kumar giri Akash giri kumar Akash";
		int count;

		string = string.toLowerCase();
		System.out.println(string);
		String word[] = string.split(" ");
		System.out.println("Duplicate words are= ");
		for (int i = 0; i < word.length; i++) {
			count = 1;
			for (int j = i + 1; j < word.length; j++) {
				if (word[i].equals(word[j])) {
					count++;
					word[j] = "0";
				}
			}
			if (count > 1 && word[i] != "0")
				System.out.println(word[i]);

		}

	}

}
