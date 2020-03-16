
public class SecondLargestNumPosition {
	public static void main(String[] args) {
		int[] arr = { 4,5,9,3,8,12,7 };
		int smax = arr[0];
		int max = arr[0];
		int thirdMax= arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(max<arr[i]) {
				smax=max;
				max=arr[i];
			}
		/*	else if(arr[i]> smax) {
				smax=arr[i];
			}*/
		}
		
		for(int i=0;i<arr.length; i++) {
			if(arr[i]<smax) {
				thirdMax= arr[i];
			}
		}
		System.out.println("Max number= "+max);
		System.out.println("second max number= "+smax);
		System.out.println("Third max number= "+thirdMax);
	}

}
