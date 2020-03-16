package com.InterviewQuestion.strings;

class JoinThread extends Thread{
	public void run() {
		for(int i = 0 ; i<5; i++) {
			System.out.println("ChildThread");
		}
	}
}

public class JoinThreadDemo {
	
	public static void main(String[] args) throws InterruptedException {
		JoinThread t = new JoinThread();
		t.start();
		t.join();
		for(int i=0; i<5; i++) {
		System.out.println("MainThread");
		}		
	}
	

}
