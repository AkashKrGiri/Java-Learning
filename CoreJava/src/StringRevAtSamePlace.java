
public class StringRevAtSamePlace {
	public static void main (String[] args) {
		String str = "We are Indian and we love India";
		// i-->       0   1    2     3  4    5    6
		String[] st = str.split(" ");
		for (int i = 0; i < st.length; i++) {
			char[] cr = st[i].toCharArray();
			for (int x = cr.length - 1; x >= 0; x--) {
				System.out.print(cr[x]);
			}
			System.out.print(" ");
		}

	}

}
