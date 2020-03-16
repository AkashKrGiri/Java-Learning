package com.interview.questions;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Cat implements Serializable {
	int i = 10;
	int j = 20;
}

public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Cat cat = new Cat();
		
		System.out.println("Serialization start");
		FileOutputStream fileoutputstream = new FileOutputStream("abc.ser");
		ObjectOutputStream objectoutputstream = new ObjectOutputStream(fileoutputstream);
		objectoutputstream.writeObject(cat);
		System.out.println("Serialization End");
		System.out.println("De-Serialization Start");
		FileInputStream fileInputStream = new FileInputStream("abc.ser");
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
		Cat cat2 = (Cat) objectInputStream.readObject();
		System.out.println("Serialization end");
		System.out.println(cat2.i + ".........." + cat.j);
	}
}