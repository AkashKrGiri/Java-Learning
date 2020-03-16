class MThread extends Thread{

	/*public void start() {
		//super.start();
		System.out.println("Start method");
	}*/

	public void run() {
		for (int i = 0; i < 5; i++) {

			System.out.println("Run method");
		}
	}
}

public class Thread2 {
	public static void main(String[] args) {

		MThread mt = new MThread();
		Thread t = new Thread(mt);
		Thread t1= new Thread();
		//t1.start();
		//mt.start();
		//mt.run();
		//t.run();
		t.start();
		for (int i = 0; i < 5; i++) {
			System.out.println("Main method");
		}

	}

}
