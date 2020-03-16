import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindNumFromString {
	public static void main(String[] args) {
		String numstr = null;
		List<String> l = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		
		list.add("23Fgs4");
		list.add("gd53hs3");
		list.add("e344");
		list.add("sdf1");
		System.out.println(list);
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			numstr = (it.next()).replaceAll("[^0-9]", "");
			l.add(numstr);
		}
		System.out.println(l);
		
	}

}
