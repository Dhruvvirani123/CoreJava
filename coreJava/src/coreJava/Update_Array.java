package coreJava;

import java.util.ArrayList;
import java.util.List;

public class Update_Array {
	public static void main(String[] args) {
		List list = new ArrayList<String>();
		list.add("Dhruv");
		list.add("Romil");
		list.add("Mantra");
		list.add("Rudra");
		list.add("Rushit");
		list.add("Darshan");
		
		System.err.println(list);
		
		list.set(2, "Mohit");
		System.out.println(list);
	}
}
