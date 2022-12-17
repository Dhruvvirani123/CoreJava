package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CopyArrayList {
	public static void main(String[] args) {
		List dhruv = new ArrayList<String>();
		dhruv.add(1);
		dhruv.add(2);
		dhruv.add(3);
		dhruv.add(4);
		dhruv.add(5);
		System.out.println("List : "+dhruv);
		
		List virani = new ArrayList<>();
		virani.add("Dhruv");
		virani.add("Darshan");
		virani.add("Tirth");
		virani.add("Piyush");
		virani.add("Romil");
		System.out.println("List 1 : "+virani);
		
		Collections.copy(dhruv, virani);
		System.out.println();
		System.out.println("Copy List to List1 After Copy : ");
		System.out.println("List : "+dhruv);
		System.out.println("List1 : "+virani);
		
	}
}
