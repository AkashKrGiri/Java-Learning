//Get and set - Thread Name, Thread priority.
class ThreadName extends Thread {

}

public class Thread3 {
	public static void main(String[] args) {
		ThreadName tn = new ThreadName();
		System.out.println("Default Thread name:- " +Thread.currentThread().getName());
		System.out.print("Costume Thread Name:-");
		Thread.currentThread().setName(" Akash");
		System.out.println(Thread.currentThread().getName());
		System.out.println("Default Thread Priority:- " +Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(8);
		System.out.println("Costume Thread Priority:- " +Thread.currentThread().getPriority());

	}

}
