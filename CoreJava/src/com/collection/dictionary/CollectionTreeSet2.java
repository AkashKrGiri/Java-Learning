package com.collection.dictionary;
import java.util.Comparator;
import java.util.TreeSet;

public class CollectionTreeSet2 {
	public static void main(String[] args){
		TreeSet ts= new TreeSet(new MyComparator());
		ts.add("Akash");
		ts.add("Revelgunj");
		ts.add("Godna");
		ts.add("Bihar");
		System.out.println(ts);
	}
}
class MyComparator implements Comparator{

	@Override
	public int compare(Object arg1, Object arg2) {
		String s1 = arg1.toString();
		String s2 = arg2.toString();
		
		return s1.compareTo(s2);
	  }
	
    }
  


