import java.util.Scanner;

public class ArraySearch {

	public static void main(String args[]) {
		int n;
		int max;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of Array");
		n = scanner.nextInt();
		
		int arr[] = new int[n];
		System.out.println("Enter the value of Array");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Find the number at place=");
		int findNum= scanner.nextInt();
		
		for(int i=0; i<n; i++){
			if(findNum == arr[i]){
				findNum= arr[i];
			}
				
			}
		System.out.println("number is:=" +arr[findNum]);
		
		
		/*max = arr[0];
		for (int i = 0; i < n; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("Max number in this Array=" + max);
*/
	}
}