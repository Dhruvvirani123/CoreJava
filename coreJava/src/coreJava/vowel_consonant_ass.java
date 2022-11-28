package coreJava;

import java.util.Scanner;

public class vowel_consonant_ass {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Character : ");
		char a=sc.next( ).charAt(0);
		
		switch(a)
		{
		case 'A':
			System.out.println("Vowel");
			break;
		case 'a':
			System.out.println("Vowel");
			break;
			
		case 'E':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
			
		case 'I':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
			
		case 'O':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
			
		case 'U':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
			
		default:
			System.out.println("Consonant");
		}
	}
}
