import java.util.Scanner;

public class WordCount {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Sentence");
		String x = sc.nextLine();
		System.out.println("Enter word to be search");
		String y = sc.nextLine();
		x = x + " ";
		int len = x.length();
		String z = "";
		int count = 0, i;
		for (i = 0; i < len-1; i++) {
             
		char a = x.charAt(i);
		
		if (a != ' ') {
			z = z + a;
		} else {
			if (z.equalsIgnoreCase(y) == true) {
				
				
			}
		}
		count++;
			//z = "";
			
		}
		System.out.println("word " + y + " is " + count);
		
	}

}