package com.InterviewQuestion.strings;

public class DuplicateNumber {
	int i, j;

	/*
	 * public static void main(String[] args) { 
	 * int arr[] = { 5, 9, 8, 8, 1, 9, 1 };
	 * for (int i = 0; i < arr.length - 1; i++) 
	 *   { 
	 *    for (int j = i + 1; j <arr.length; j++) { 
	 *         if ((arr[i] == arr[j])) { 
	 *        System.out.println("Dup value:-"+ arr[j]); 
	 *      } 
	 *     } 
	 *    }
	 *  }
	 */
    void dupNum(int arr[]) {
		System.out.print("DupNum are:- ");
		for (i = 0; i < arr.length; i++) {
			for (j = i+1; j < arr.length; j++) {
				if ((arr[i] == arr[j]) && (i != j)) {
					System.out.print(arr[i]+ " ");
				}
			}
		}
	}

	public static void main(String[] args) {
		DuplicateNumber dn = new DuplicateNumber();
		int arr[] = { 2, 3, 4, 2, 6, 7, 3, 8 };
		dn.dupNum(arr);
	}
}
