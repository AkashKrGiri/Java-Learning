package com.InterviewQuestion.strings;

public class OccurrenceOfWord {
	public static int findOccurrence(String str, String word) {
		String x[] = str.split(" ");
		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (word.equals(x[i]))
				count++;
		}

		return count;

	}

	public static void main(String[] args) {

		String str = "Java is Programming languag, Java is high level language";
		String word = "Java";
		System.out.println(word+ " occurrence "+findOccurrence(str, word)+ " times");

	}

}
