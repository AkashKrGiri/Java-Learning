
public class ConstructorDemo {
	int value1;
	int value2;

	ConstructorDemo() {
		value1 = 10;
		value2 = 20;
		System.out.println("Constructor block 1");
	}

	ConstructorDemo(int a) {
		value1=a;
		System.out.println("Constructor block 2");
	}
	ConstructorDemo(int x, int y){
		value1= x;
		value2= y;
		System.out.println("Condtructor block 3");
	}
	
	public void display() {
		System.out.println("value1==" + value1);
		System.out.println("value2==" + value2);
	}

	public static void main(String[] args) {
		ConstructorDemo demo1 = new ConstructorDemo();
		ConstructorDemo demo2 = new ConstructorDemo(30);
		ConstructorDemo demo3 = new ConstructorDemo(40,50);
		demo1.display();
		demo2.display();
		demo3.display();
	}
}
