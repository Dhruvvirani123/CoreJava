package Java_Assessment_Student_Management_System;

import java.util.ArrayList;
import java.util.Scanner;

public class Java_Assessment_Student_Management_System {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList list = new ArrayList<>();
		
		System.out.println("Student Management System");
		
		System.out.println();
		
		
		System.out.println("Press 1 for Counsellr...");
		System.out.println("press 2 for faculty...");
		System.out.println("press 3 fr student...");
		System.out.println();
		System.out.print("Enter 1 to 3 : ");
		int n = sc.nextInt();
		
		switch(n)
		{
		case 1:
			System.out.println("1. Add Student...");
			System.out.println("2. Remove Student...");
			System.out.println("3. View All Student...");
			System.out.println("4. View Specific Student...");
			System.out.println();
			System.out.print("Enter 1 to 4 : ");
			n = sc.nextInt();
			if(n==1)
			{
				System.out.print("Enter Seiral Number : ");
				int a = sc.nextInt();
				list.add(a);
				
				System.out.print("Enter First Name : ");
				String b = sc.next();
				list.add(b);
				
				System.out.print("Enter Last Nmae : ");
				String c = sc.next();
				list.add(c);
				
				System.out.print("Enter Contact Number : ");
				long d = sc.nextLong();
				list.add(d);
				
				System.out.print("Enter Subject : ");
				String e = sc.next();
				list.add(e);
				
				System.out.print("Enter Marks : ");
				int f = sc.nextInt();
				list.add(f);
				
				System.out.print("Enter Fees : ");
				int g = sc.nextInt();
				list.add(g);
				
				System.out.println(list);
			}
		}
	}
}