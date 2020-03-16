import java.util.Scanner;
import java.util.regex.Pattern;

public class ABC123Regex {
	public static void main(String[] args) {
		String str1 = "...\\d{3}";
		String str2;
		System.out.println("Enter the String:= ");
		Scanner sc = new Scanner(System.in);
		str2 = sc.nextLine();
		ABC123Regex.isMatch(str1, str2);

	}

	public static String isMatch(String str1, String str2) {
		System.out.println(Pattern.matches(str1, str2));
		return str2;

	}

}
