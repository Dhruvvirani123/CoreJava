package coreJava;

import java.util.Scanner;

public class concatenate_with_String {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);  
//		String s = "Dhruv ";
//		String s1 = "Viarni";
//		System.out.println(s.concat(s1));
					
		
					//User Input String And concat string
		
		System.out.print("Enter String 1 : ");
		String str = sc.nextLine();
		
		System.out.print("Enter String 2 : ");
		String str1 = sc.nextLine();
		
		System.out.print("Enter String 3 : ");
		@SuppressWarnings("unused")
		String str2 = sc.nextLine();
		
		System.out.println();
		System.out.println(str.concat(str1));
	}
}
