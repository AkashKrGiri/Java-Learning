
public class DuchFlagProb {
	public static void main(String[] args) {
	int[] arr = { 0, 1, 0, 0, 1, 2, 1, 0, 2, 1, 2, 0, 2, 2 };
		
		int temp = 0;
		int start = 0;
		int mid = 0;
		int end = arr.length - 1;
		while (mid <= end) {
			switch (arr[mid]) {
			
			case 0: {
				temp = arr[start];
				arr[start] = arr[mid];
				arr[mid] = temp;
				start++;
				mid++;
				break;

			}
			case 1: {
				mid++;
				break;
			}
			case 2: {
				temp = arr[mid];
				arr[mid] = arr[end];
				arr[end] = temp;
				end--;
				break;

			   }
			
			}
			
		}
		for(int i=0; i<arr.length-1; i++) {
			System.out.print(arr[i]+" ");
		}
		
	}

}
