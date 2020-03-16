package com.InterviewQuestion.strings;




public class PhonePolyMorphism {
	public static void main(String[] args) {
		PhonePolyMorphism phone = new PhonePolyMorphism();
		phone.call(5,7);
	}
	
	private void call() {
		System.out.println("Calling");
		
	}
	private void call(int a, int b) {
		System.out.println("Call to me "+(a+b));
		
	}


}
