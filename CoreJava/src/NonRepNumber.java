import java.util.HashMap;
import java.util.Map;

public class NonRepNumber {

	public static void main(String[] args) {

		int[] arr = { 8, 4, 6, 8, 3, 4, 7, 9, 8, 2, 6, 2, 12, 1 };
		int n = arr.length;
		nonRepNumber(arr, n);

	}

	public static void nonRepNumber(int[] arr, int n) {
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (m.containsKey(arr[i])) {
				m.put(arr[i], m.get(arr[i]) + 1);
			} else {
				m.put(arr[i], 1);
			}
		}
		for (Map.Entry<Integer, Integer> x : m.entrySet()) {
			if (x.getValue() == 1) {
				System.out.print(x.getKey() + " ");
			}
		}

	}

}
