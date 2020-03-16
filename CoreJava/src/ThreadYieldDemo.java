
class YThread extends Thread {
	public void run() {
		Thread.yield();
		for (int i = 0; i < 5; i++) {
			System.out.println("Run method");
		}

	}

}

public class ThreadYieldDemo {
	public static void main(String[] args) {

		YThread yt = new YThread();
		yt.start();
		// Thread.yield();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Main thread");
		}

	}

}
