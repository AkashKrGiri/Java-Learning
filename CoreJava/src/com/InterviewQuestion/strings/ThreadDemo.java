package com.InterviewQuestion.strings;

class MyThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("ChildThread");
		}
	}
}

public class ThreadDemo extends MyThread {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("MainThread");
		}
		
	}

}
