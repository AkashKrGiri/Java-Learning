


/*public class OOPD1_1 extends Student {

	public static void main(String[] args) {
		OOPD1_1 s1= new OOPD1_1();
		OOPD1_1 s2= new OOPD1_1();
		s1.studentName="Akash";
		s2.studentNumber=1234;
		
		System.out.println("Student Name:-"+s1.studentName);
		System.out.println("Student Number:-"+s2.studentNumber);
		

	}
	
	class Student{
		String studentName="Akash";
		int studentNumber=1234;
	}
}
*/
class OOPD1_1{
	String stuName;
	int stuNumber;
	public static void main(String[] args){
		OOPD1_1 s1 = new OOPD1_1();
		OOPD1_1 s2 = new OOPD1_1();
		s1.stuName="Akash";
		s2.stuNumber=123;
		System.out.println("Student Name:-"+s1.stuName);
		System.out.println("Student Roll:-"+s2.stuNumber);	
	}
}