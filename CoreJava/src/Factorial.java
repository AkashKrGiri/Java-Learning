import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.print("Enter num for Factorial check= ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		long fact;
		for (fact = 1; num > 1; num--)
			fact = fact*num;
		System.out.println("Factorial of your num= " + fact);
	}

}
