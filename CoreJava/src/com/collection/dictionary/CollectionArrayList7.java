package com.collection.dictionary;
//Collection: .reverse() operation in ArrayList


import java.util.ArrayList;
import java.util.Collections;


public class CollectionArrayList7 {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        for(String str: list)
        {
            System.out.println(str);
        }
       
//- See more at: http://www.java2novice.com/java-collections-and-util/arraylist/content-reverse/#sthash.MxG8yfE8.dpuf
	}

}
