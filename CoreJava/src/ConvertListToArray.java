import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertListToArray {
	public static void main(String[] args) {
		String[] str;
		List<String> list = new ArrayList<>();
		list.add("Red");
		list.add("Blue");
		list.add("Pink");
		list.add("Green");
		System.out.println(list);
		str = list.toArray(new String[list.size()]);
		for (String s : list) {
			System.out.print(s + " ");

		}
		List<String> list2 = new ArrayList();
		list2 = Arrays.asList(str);
		System.out.println();
		System.out.println(list2);

	}

}
