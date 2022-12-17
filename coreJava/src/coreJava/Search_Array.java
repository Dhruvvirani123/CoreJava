package coreJava;

import java.util.ArrayList;
import java.util.List;

public class Search_Array {
	public static void main(String[] args) {
		List list = new ArrayList<String>();
		list.add("Dhruv");
		list.add("Romil");
		list.add("Mantra");
		list.add("Rudra");
		list.add("Rushit");
		list.add("Darshan");
		
		System.out.println(list);
		
		if(list.contains("Romil")) {
			System.out.println("Found The Element....");
		}
		else {
			System.out.println("Data not found....");
		}
	}
}
