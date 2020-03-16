
public class CountLengthOfLastWord {
	public static void main(String[] args) {
	String str= "High Tech city of India is Bangalore";
	String[] ss= str.split(" ");
	char[] arr = ss[ss.length-1].toCharArray();
	System.out.println(arr.length);
	}

}
