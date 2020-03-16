import java.util.Scanner;

public class PalindromNumCheck {
	public static void main(String[] args) {
		System.out.println("For chack palindrom number enter the number = ");
		Scanner sc = new Scanner(System.in);
		int num= sc.nextInt();
		int palindrom=num;
		int temp=0;
		int rev=0;
		while(num!=0) {
			temp=num%10;
			rev= rev*10+temp;
			num= num/10;
			
		}
		if(rev==palindrom) {
			System.out.println(rev+" Palindrom num");
		}
		else {
			System.out.println("not palindrom");
		}
		
	}

}
