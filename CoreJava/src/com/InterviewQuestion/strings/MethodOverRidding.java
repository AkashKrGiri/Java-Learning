package com.InterviewQuestion.strings;

public class MethodOverRidding {
	public static void main(String[] args) {
		MethodOverRidding methodOverRidding = new MethodOverRidding();
		methodOverRidding.netWork();
	}
	void netWork() {
		System.out.println("Poor Network");
	}
	
	class Tower extends MethodOverRidding{
			void netWork() {
			System.out.println("Strong Network");
		}
		
	} 

}

