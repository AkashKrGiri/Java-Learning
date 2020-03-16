import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
	System.out.println("Enter the number to chack Palindrome: ");
	Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();//434
		int rev;
		int sum=0;
		int temp=num;
		while(num>0) {
			rev= num%10;        // {434 % 10 = 4},              {43%10=3},     {4%10=4}
			sum = (sum*10)+rev; // {(0*10)+ 4 ==> 0+4 = 4},     {(4*10)+3=43}, {(43*10)+4==> 430+4= 434}
			num= num/10;        // {434 = 434/10 ==>43.4 = 43}, {43/10= 4},    {4/10=0.4}
			
		}
		if(sum==temp) {
			System.out.println("Palindrome");
			
		}
		else {
			System.out.println("Not Palindrome");
		}
		
	}

}
