package com.collection.dictionary;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

//How to sort LinkedList using Comparator?

public class CollectionLinkedList8 {
	public static void main(String[] args){
		
		LinkedList<Empl> list = new LinkedList<Empl>();
		
		list.add(new Empl("Akash", 30000));
		list.add(new Empl("vijay", 34300));
		list.add(new Empl("Aman", 23200));
		list.add(new Empl("Saurav", 54100));
		list.add(new Empl("Omi", 54000));
		//System.out.println(list);
	    
		Collections.sort(list,new MySalaryCompayar());
		System.out.println("Sorted list");
		for(Empl e : list){
			System.out.println(e);
		}
		
	}

}

abstract class MySalaryCompayar implements Comparator<Empl> {

	@Override
	public int compare(Empl e1, Empl e2) {
		if(e1.getSalary()< e2.getSalary()){
		
		return 1;
	} else {
		return -1;
	  }
	
	}
}

class Empl{
	private String name;
	private int salary;
	
	public Empl(String n, int s){
	this.name=n;
	this.salary=s;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Empl name=" + name + " salary=" + salary ;
	}
	
}
