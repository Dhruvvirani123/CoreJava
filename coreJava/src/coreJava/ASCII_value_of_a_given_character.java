package coreJava;

import java.util.Scanner;

public class ASCII_value_of_a_given_character {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter String : ");
			String str = sc.nextLine();
			int c = str.codePointAt(0);
			System.out.print("String Characters Values is : "+c);
			
			System.out.println();
			System.out.println();
			
			
			//String Length
			System.out.print("Enter String : ");
			String s = sc.nextLine();
			System.out.println("length of string : "+s.length());
	}
}
