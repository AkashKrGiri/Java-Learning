
public class CountTotalCharInFile {
	public static void main(String[] args) {
		String str = "Hi every one this is Akash from India";
		String[] st = str.split(" ");
		char[] arr = null;
		int totalchar = 0;
		for (int i = 0; i <= st.length - 1; i++) {
			arr = st[i].toCharArray();
			totalchar = totalchar + arr.length;

		}
		System.out.print(totalchar + " ");
	}

}
