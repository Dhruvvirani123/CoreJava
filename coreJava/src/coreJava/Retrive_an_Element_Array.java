package coreJava;

import java.util.ArrayList;
import java.util.List;

public class Retrive_an_Element_Array {
	public static void main(String[] args) {
		List list = new ArrayList<String>();
		list.add("Dhruv");
		list.add("Romil");
		list.add("Mantra");
		list.add("Rudra");
		list.add("Rushit");
		list.add("Darshan");
		
		System.out.println(list);
		String element = (String) list.get(0);
		System.out.println("First Element : "+element);
		
		element = (String) list.get(2);
		System.out.println("Third Element : "+element);
	}
}
