
class Bike{
	String bikeName;
	int bikeModle;
	void start()
    {
		System.out.println("Bike Start");
	}
	void move()
	{
		System.out.println("Bike Moving");
	}
	void stop()
	{
		System.out.println("Bike stop");
	}
}

class Student {
	String studentName;
	int studentNumber;
	
	void goingToCollegeByBike(Bike b)
	{
		System.out.println("I am going college by-"+b.bikeName+"--"+b.bikeModle);
	}
}

public class IS_A_HAS_A {
	public static void main(String[] args){
		//Creating Bike object
		
	  Bike b= new Bike();
		b.bikeModle=2017;
		b.bikeName="Honda CBR";
		
		//Creating Student Object
		Student st = new Student();
		st.studentName="Akash";
		st.studentNumber=1234;
	    //b.start(); 
		//b.move();
		st.goingToCollegeByBike(b);		
	}
}

/*
class Employee{
	float salary=40000;
}
public class IS_A_HAS_A extends Employee {
	int bonus=10000;
	
	public static void main(String[] args){
		IS_A_HAS_A ishas=new IS_A_HAS_A();
		System.out.println("Salary="+ishas.salary);
		System.out.println("bonus="+ishas.bonus);
	}
}
*/