package coreJava;

import java.util.Scanner;

public class Simple_Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Your Name : ");
		String name = sc.nextLine();
		System.out.println("Your name is : "+name);
	}
}