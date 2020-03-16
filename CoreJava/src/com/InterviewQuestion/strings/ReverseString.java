package com.InterviewQuestion.strings;

public class ReverseString {
	public static void main(String[] args) {
	  /* String str = " MyJava ";
	   char[] strArray=  str.toCharArray();
	   for(int i = strArray.length-1 ; i>=0; i--) {
		   System.out.print(strArray[i]);
	   }
	   
		StringBuffer sbf = new StringBuffer("Akash");
		System.out.print(sbf.reverse());
		*/
		
		String str="ABC";
		char[] cr = str.toCharArray();
		for(int i = cr.length-1; i>=0; i--) {
			System.out.print(cr[i]);
			
		}
		
		
	}
		

}
