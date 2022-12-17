package coreJava;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionArrayList {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		  list.add("Dhruv");
		  list.add("Darshan");
		  list.add("Tirth");
		  list.add("Romil");
		  list.add("Rushit");
		  list.add("A");
		  list.add("Z");
		  
		  System.out.println("List Before Sort : "+list);
		  Collections.sort(list);
		  System.out.println("List After Sort : "+list);
	}
}
