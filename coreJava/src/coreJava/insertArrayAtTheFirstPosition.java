package coreJava;

import java.util.ArrayList;
import java.util.List;

public class insertArrayAtTheFirstPosition {
	public static void main(String[] args) {
		List list = new ArrayList<>();
		list.add("Dhruv");
		list.add("Romil");
		list.add("Mantra");
		list.add("Rudra");
		list.add("Rushit");
		list.add("Darshan");
		
		System.out.println(list);
		list.add(0,"Tirth");
		list.add(3,"Piyush");
		
		System.out.println(list);
	}
}