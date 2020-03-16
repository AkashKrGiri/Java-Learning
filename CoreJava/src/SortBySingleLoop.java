
public class SortBySingleLoop {
	public static void main(String[] args) {
		int temp=0;
		int[] arr= {2,0,0,1,0,0,2};
		for(int i=0; i <  arr.length; i++ ) {
			if(arr[i]< arr[i+1]) {
				temp=arr[i];
				arr[i]= arr[i+1];
				arr[i+1]=temp;
			}
			
		}
		
	}

}
