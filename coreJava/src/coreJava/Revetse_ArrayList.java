package coreJava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Revetse_ArrayList {
	public static void main(String[] args) {
		List list = new ArrayList<String>();
		list.add("Dhruv");
		list.add("Romil");
		list.add("Mantra");
		list.add("Rudra");
		list.add("Rushit");
		list.add("Darshan");
		
		System.out.println("Before Reversing : "+list);
		
		Collections.reverse(list);
		
		System.out.println("After Reversing : "+list);
	}
}
