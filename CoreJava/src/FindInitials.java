
public class FindInitials {
	public static void main(String[] args) {
		//String str= "Akash Kumar Giri";
		String str = "Hindustan Computers Limited";
		String[] words = str.split(" ");
		for(String word : words)
			System.out.print(word.charAt(0)+ " ");
	}

}
