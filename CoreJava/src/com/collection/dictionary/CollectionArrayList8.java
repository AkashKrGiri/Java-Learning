package com.collection.dictionary;
//Collections: .shuffle() operation in ArrayList

import java.util.ArrayList;
import java.util.Collections;


public class CollectionArrayList8 {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Cric");
        list.add("Play");
        list.add("Watch");
        list.add("Glass");
        System.out.println(list);
        Collections.shuffle(list);
        for(String str: list){
        System.out.println(str);
        
	}
        Collections.shuffle(list);
        for(String str: list){
            System.out.println(str);
            
    	}
   }
	
}
