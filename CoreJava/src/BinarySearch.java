import java.util.Scanner;

public class BinarySearch {
	public static void main(String[] agr) {
		int arr[] = { 2, 6, 9, 12, 21, 25, 36 };
		System.out.println("chose your number from these :- 2,6,9,12,21,25,36");
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (a == arr[mid]) {
				System.out.println("your number is:- " + a + " at " + mid + " position");
			}
			if (a < arr[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
	}
}

/*
 * class BinarySearch{ public static int binarySearch(int arr[], int first, int
 * last, int key){ if (last>=first){ int mid = first + (last - first)/2; if
 * (arr[mid] == key){ return mid; } if (arr[mid] > key){ return
 * binarySearch(arr, first, mid-1, key);//search in left subarray }else{ return
 * binarySearch(arr, mid+1, last, key);//search in right subarray } } return -1;
 * } public static void main(String args[]){ int arr[] = {10,20,30,40,50}; int
 * key = 30; int last=arr.length-1; int result = binarySearch(arr,0,last,key);
 * if (result == -1) System.out.println("Element is not found!"); else
 * System.out.println("Element is found at index: "+result); } }
 * 
 */
