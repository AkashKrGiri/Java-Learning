
public class PatternOneSquare {
	public static void main(String[] args) {
		int n=1;
		for(int i=1; i<=4; i++) {
			int temp=0;
			for(int j=1; j<i+1; j++) {
				
				System.out.print(n+"");
				temp=temp*10+n;
				
			}
			System.out.println(" "+temp*temp+" ");
		}
		
	}

}
