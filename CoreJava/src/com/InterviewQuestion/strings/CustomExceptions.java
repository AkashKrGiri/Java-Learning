package com.InterviewQuestion.strings;
 class MyException extends Exception{
	 public MyException(String s) {
		 super(s);
	 }
}

public class CustomExceptions {
	public static void main(String[] args) {
		try {
			throw new MyException("Exception");
			
		}catch(MyException me) {
			System.out.println("Caught");
			System.out.println(me.getMessage());
		}
	}

}
