import java.util.HashMap;
import java.util.Set;

class TestClass {
	public static void main(String[] args) {
		String s1 ="AkashKumarGiri";
		String s2 ="GiriAkashKumar";
		
		if(s1.length()!=s2.length()){
			System.out.println("S2 is not Rotated string of s1");
		}else {
			String s3=s1+s1;
			System.out.println(s3);
			if(s3.contains(s2)) {
				System.out.println("S2 is  Rotated string of s1");
			}
			else {
				System.out.println("S2 is not Rotated string of s1");
			}
			
		}
				

	}
}