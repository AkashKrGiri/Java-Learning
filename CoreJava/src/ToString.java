
public class ToString {
	String name;
	int roll;
	ToString(String name, int roll){
		this.name = name;
		this.roll= roll;
		
	}
	public static void main(String[] args) {
		ToString tostring1 = new ToString("Akash", 101);
		ToString tostring2 = new ToString("Chikku", 102);
		
		System.out.println(tostring1);
		System.out.println(tostring1.toString());
		System.out.println(tostring2);
	}

}
