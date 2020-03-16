import java.util.Arrays;

public class RemoveDuplCharAndSort {
	public static void main(String[] args) {
 /*      char[] chr = { 'c', 'a', 'c', 'd', 'a', 'b', 'c', 'c', 'b', 'c' };
		Arrays.sort(chr);
		String str = "";
		for (int i = 0; i < chr.length; i++) {
			if (str.indexOf(chr[i]) == -1)
				str = str + chr[i];
		}
		System.out.println(str);
*/
		String[] str= {"a","c","a","c","b","c","b","a","c","b","d"};//{"d","a","b","c"}
		Arrays.sort(str);
		String[] y= {""};
		for(int j =0 ; j<str.length; j++) {
		//System.out.print(str[j]+" ");
		}
		String temp;
		String s="";
		for(int i=0; i<str.length;i++) {
			if(s.indexOf(str[i])==-1) {
				s= s+str[i];
				
			}
			
		}
		/*for(int x=0; x<s.length(); x++) { 
			y= s.split(s);
		}
		
		System.out.println(y);*/
		System.out.println(s);
		
	}

}
