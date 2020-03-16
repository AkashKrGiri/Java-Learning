import java.util.HashSet;


public class HashSet1 {
	public static void main(String[] args)
	{
		HashSet hs = new HashSet();
		hs.add("AK");
		hs.add("Z");
		hs.add("BK");
		hs.add("PK");
		hs.add("Z");
		//hs.remove("BK");
		System.out.println(hs);
		System.out.println(hs.add("CK"));
		
		System.out.println(hs);
	}

}
