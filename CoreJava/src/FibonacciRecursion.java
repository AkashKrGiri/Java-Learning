
public class FibonacciRecursion {
	
     static int n1=0, n2=1, n3=0;
	private static void printRecursion(int count) {
		if(count>0){
			n3= n1+n2;
			n1=n2;
			n2=n3;
			System.out.print(" "+n3);
			
			printRecursion(count-1);
		}
		
		
	}
	public static void main(String[] args){
		int count=6;
		System.out.print(n1+ " "+n2);
		printRecursion(count-2);
	}

}
