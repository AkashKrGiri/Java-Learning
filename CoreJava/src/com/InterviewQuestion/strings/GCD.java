//Greatest Common Divisor (GCD)

package com.InterviewQuestion.strings;
public class GCD {
	static int gcd(int x, int y) {
		if(x==0 && y==0)
			return 0;
		if(x==y)
			return x;
		if(x>y)
			return gcd(x-y, y);
			return gcd(x, y-x);
			
	}
	public static void main(String[] args) {
		int x=25, y=15;
		
		System.out.println("GCD of "+x+" and "+y+" is " + gcd(x, y));
	}

}
