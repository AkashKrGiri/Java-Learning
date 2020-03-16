class Display {
	public synchronized void wish(String name) {
		for (int i = 0; i < 5; i++) {

			System.out.print("Good morning: ");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println(name);
		}
	}

}

class SThread extends Thread {
	Display d;
	String name;

	SThread(Display d, String name) {
		this.d = d;
		this.name = name;

	}

	public void run() {
		d.wish(name);
	}
}

public class ThreadSyncDemo {
	public static void main(String[] args) {
		Display di1 = new Display();
		Display di2 = new Display();
		// Impact of Synchronization
		SThread st1 = new SThread(di1, "Akash");
		SThread st2 = new SThread(di1, "Kumar");
		
		//There is no Impact of Synchronization
	/*  SThread st1 = new SThread(di1, "Akash");
		SThread st2 = new SThread(di2, "Kumar");
	*/
		st1.start();
		st2.start();
	}

}
