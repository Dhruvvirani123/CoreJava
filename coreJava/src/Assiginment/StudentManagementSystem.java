package Assiginment;

import java.util.Scanner;

public class StudentManagementSystem {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Student Management System");
		
		System.out.println("Press 1 For Counseller ");
		System.out.println("Press 2 For Faculty ");	
		System.out.println("Press 3 For Student ");
		System.out.println();
		System.out.print("Enter Any Option : ");
		int a = sc.nextInt();
	
			switch(a) {
			case 1:
			{
					System.out.println("1. Add Student ");
					System.out.println("2. Remove Student ");
					System.out.println("3. View all Student ");
					System.out.println("4. View Specific Student ");
			 }
		}	
		
	}		
}