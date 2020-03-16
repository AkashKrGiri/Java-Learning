import java.util.Scanner;


public class Fibonacci {

	public static void main(String[] args) {
		System.out.println("Enter size for Fibonacci");
		Scanner sc = new Scanner(System.in);
		int x= sc.nextInt();
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" ");
		for(int i=0; i<x; ++i)
		{
		        c = a+b;
			     a=b;
			     b=c;
		System.out.print(a+" ");
	
		
		}
	}

}
