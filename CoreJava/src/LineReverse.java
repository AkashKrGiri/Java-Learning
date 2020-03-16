import java.util.Set;
import java.util.TreeSet;

public class LineReverse {
	public static void main(String[] args) {
		String str = "One Two Three Four Five Six Seven Eight Nine Ten";
		Set<String> set = new TreeSet<String>();
		String[] arr = str.split(" ");
		for (String s : arr) {
			set.add(s);

		}
		//System.out.println(set);
		
		String[] ss= set.toArray(new String[set.size()]);
		for(String st: ss)
		System.out.print(st+" ");
 	}

}
