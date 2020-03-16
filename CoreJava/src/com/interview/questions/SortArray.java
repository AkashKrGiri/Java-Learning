package com.interview.questions;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 6, 3, 8, 2, 99, 12, 46 };
		/*
		 * Arrays.sort(arr); System.out.println(Arrays.toString(arr));
		 */
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; i++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}

			}
		}
		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
