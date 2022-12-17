package coreJava;

import java.util.ArrayList;
import java.util.List;

public class Extract_Portion_Arraylist {
	public static void main(String[] args) {
		List list = new ArrayList<String>();
		list.add("Dhruv");
		list.add("Romil");
		list.add("Mantra");
		list.add("Rudra");
		list.add("Rushit");
		list.add("Darshan");
		System.out.println("List : "+list);
		
		List list1 = list.subList(0, 2);
		
		System.out.println("List of First Four Array : "+list1);
	}
}