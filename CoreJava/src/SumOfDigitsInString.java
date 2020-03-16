
public class SumOfDigitsInString {
	public static void main(String[] args) {
		String str = "a2n4iufgui1bdkvkd5njn8";
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				sum = sum + Integer.parseInt(str.charAt(i) + "");
			}

		}
		System.out.println(sum);
	}

}
