class A {
	public synchronized void foo(B c) {
		System.out.println("Thread start execution of foo() method");
		try

		{
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread trying to call b.last()");
	}

	public synchronized void last() {
		System.out.println("Inside A, this is Last()");

	}

}

class B {
	public synchronized void bee(A a) {
		System.out.println("Thread start execution of bee() method");

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		System.out.println("Thread trying to call b.last()");
	}

	public synchronized void bee() {
		System.out.println("Inside B, this is last()");
	}

}

public class ThreadDeadLockDemo implements Runnable {

	A a = new A();
	B b = new B();

	ThreadDeadLockDemo() {
		Thread t = new Thread(this);
		t.start();
		a.foo(b);

	}

	@Override
	public void run() {
		b.bee(a);
	}

	public static void main(String[] args) {
		new ThreadDeadLockDemo();
	}

}
