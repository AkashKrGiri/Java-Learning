
public class ToStringVsHashCode {
	int i;

	public ToStringVsHashCode(int i) {
		this.i = i;

	}

	// 10
	// 100
	public int hashCode() {
		return i;
		// ToStringVsHashCode@a
		// ToStringVsHashCode@64
	}

	public String toString() {
		return i + ""; // 10
						// 100

	}

	// ToStringVsHashCode@15db9742
	// ToStringVsHashCode@6d06d69c
	public static void main(String[] args) {
		ToStringVsHashCode t1 = new ToStringVsHashCode(10);
		ToStringVsHashCode t2 = new ToStringVsHashCode(100);
		System.out.println(t1);
		System.out.println(t2);
	}
}
