import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class CapitalSentence {
	/*public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String x = sc.nextLine();
		String y = " ";
		for(int i=0;i<x.length();i++) {
			
			if(x.charAt(i)>96 && x.charAt(i)<123) {
				
				y = y + (char)(x.charAt(i)-32);
			}
			else if(x.charAt(i)==' ') {
				y = y + ' ';
			}
		}
		System.out.println(y);
	}*/
	public static void main(String[] args) throws IOException {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    // Actually use the Reader
	    String name = br.readLine();
	    // Don't mistake String object with a Character object
	    String s1 = name.substring(0, 1).toUpperCase();
	    String nameCapitalized = s1 + name.substring(1);
	    System.out.println(nameCapitalized);
	}
}


