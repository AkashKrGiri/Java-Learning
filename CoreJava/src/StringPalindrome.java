
public class StringPalindrome {
	public static void main(String[] args) {
		String str = "AKA";
		
		char[] crr = str.toCharArray();
		int i;
		String st = "";
		for (i = crr.length - 1; i >= 0; i--) {
			st = st + crr[i];
		}
		if (str.equals(st)) {
			System.out.println(" Yes it is palindrome");
		} else {
			System.out.println(" No it is not a palindrome");
		}
	}

}
