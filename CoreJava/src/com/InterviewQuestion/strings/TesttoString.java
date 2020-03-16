package com.InterviewQuestion.strings;


class Test{
	/*int i;
	Test(int i){
		this.i = i;
		
	}
	public int hashCode() {
		return i;
	}*/
	String name;
	int roll;
	Test(String name, int roll){
		this.name= name;
		this.roll = roll;
		
	}
}
public class TesttoString {
	public static void main(String[] args) {
		Test t1= new Test("Akash", 101);
		Test t2 = new Test("Kumar", 102);
		/*System.out.println(t1);
		System.out.println(t1.toString());
		System.out.println(t2);
		System.out.println(t2.toString());
		
		Test t = new Test(100);
		System.out.println(t);
		*/
		Test t3 = t1;
		System.out.println(t1.equals(t3));
		
	}
	

}
