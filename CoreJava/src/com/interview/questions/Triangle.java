package com.interview.questions;

//import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		/*
		 * String a; System.out.println("Enter numbers"); Scanner sc= new
		 * Scanner(System.in); a=sc.next();
		 */
		int i,j,k;
		for (i = 1; i <= 6; i++) {
			for ( j = 5; j >= i; j--) {
				
				System.out.println(" ");

			}
			for (k = 1; k <= (2 * i - 1); k++) {
				System.out.println("*");
			}
			System.out.println("");
		}
		

	}

}
/*
public static void main(String[] args) 
{
int i,j,k;
for(i=1; i<=5; i++)
{
for(j=4; j>=i; j--)
{
System.out.print(" ");
}
for(k=1; k<=(2*i-1); k++)
{
System.out.print("*");
}
System.out.println("");
}
}
}
*/