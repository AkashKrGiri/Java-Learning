package com.collection.dictionary;

 
public class BarCode{
	public static void main(String[] args) {
		System.out.println();
		BarCode b1 = new BarCode();
		BarCode b2 = t1(b1);
		BarCode b3 = new BarCode();
		b2=b3;
		
	}
	static BarCode t1(BarCode temp){
		temp = new BarCode();
		return temp;
	}
}
