
public class Thread1 
{

	public static void main(String[] args) 
	{
		MyThread t = new MyThread();
		t.start();
		t.run();
		for(int i=0; i <10 ; i++)
		{
			System.out.println("Hello main");
	    }
	}

}
class MyThread extends Thread {
	public void run()
	{
		for(int i=0;i<10;i++){
			System.out.println("Hi child");
			//Thread.yield();
		}
	}
}
