package com.interview.questions;

import java.util.Scanner;

public class FindMaxNumber {
	public static void main(String[] args) {
		int n;
		int max;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of Array:- ");
		n = sc.nextInt();
		int arr[] = new int[n];

		System.out.println("Enter the Array Value");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		max = arr[0];
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}

		}
		System.out.println("Max value is :- " +max);

	}

}
