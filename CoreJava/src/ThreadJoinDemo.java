class JThread extends Thread {
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Child Thread");

		}
		try {
			Thread.sleep(5000);
		}
		catch(InterruptedException e) {
			
		}
	}

}

public class ThreadJoinDemo  {
	public static void main(String[] args) throws InterruptedException{
		JThread jt = new JThread();
		jt.start();
		jt.join();
		for(int i=0; i<5; i++) {
			System.out.println("Main thread");
		}
	}

}
