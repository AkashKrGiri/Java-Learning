
//2,3,5,7,11,13,17...etc.

class PrimeNumber {
	public static void main(String args[]) {
		int flag = 0;
		int i;
		int[] arr = { 4, 3, 5, 7, 9, 11, 13,2, 16, 17, 8 };
		for (i = 0; i < arr.length ; i++) {
			for (int j = 2; j <= arr[i] / 2; j++) {
				if (arr[i] % j == 0) {
					flag = 1;
					break;
				} else {
					flag = 0;
				}
			}
			if (flag == 1) {

				System.out.println("Not prime:" + arr[i]);
				flag=0;
			} else {
				System.out.println("Prime :" + arr[i]);
			}
		}
	}
}
