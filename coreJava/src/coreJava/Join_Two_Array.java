package coreJava;

import java.util.ArrayList;
import java.util.List;

public class Join_Two_Array {
	public static void main(String[] args) {
		List list = new ArrayList<String>();
		list.add("Dhruv");
		list.add("Romil");
		list.add("Mantra");
		list.add("Rudra");
		list.add("Rushit");
		list.add("Darshan");
		System.out.println("List of First : "+list);
		
		List list1 = new ArrayList<String>();
		
		list1.add("Tirth");
		list1.add("Rohit");
		list1.add("Savan");
		list1.add("Jaydeep");
		list1.add("Baldev");
		list1.add("DK");
		System.out.println("List of Secound : "+list1);
		
		ArrayList dh = new ArrayList<>();
		dh.addAll(list);
		dh.addAll(list1);
		
		System.out.println("New Array : "+dh);
	}
}
