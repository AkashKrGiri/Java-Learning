import java.util.Scanner;

public class DictionarySort {
	public static void main(String[] args) {
		int count;
		String temp;
		String s;
		System.out.println("Enter size of word");
		Scanner sc = new Scanner(System.in);
		count = sc.nextInt();
		System.out.println("Enter you words one by one ");
		String[] str = new String[count];
		for (int i = 0; i < count; i++) {
			str[i] = sc.nextLine();
		}
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (str[i].compareTo(str[j]) > 0) {
					temp = str[i];
					str[i] = str[j];
					str[j] = temp;
				}
			}
		}
		System.out.println("Sorted Words:");
		for (int i = 0; i <= count - 1; i++) {
			System.out.print(str[i] + " ");
		}

	}

}
