import java.util.Scanner;

public class SpringPalindrom {
	public static void main(String[] args) {
		String rev = "";

		System.out.println("Enter your String : ");
		Scanner sc = new Scanner(System.in);

		String str = sc.nextLine();

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			System.out.println(str + " is Palindrom");
		} else {
			System.out.println(str + " is not Palindrom");
		}
	}

}
