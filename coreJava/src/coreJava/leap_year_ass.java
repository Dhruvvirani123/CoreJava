package coreJava;

import java.util.Scanner;

public class leap_year_ass {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter Year : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0)
		{
			if(year % 400 == 0)
			{
				if(year % 100 == 0)
				{
					System.out.println("This is Leap Year.");
				}
				else
				{
					System.out.println("This is not Leap Year.");
				}
			}
			else
			{
				System.out.println("This is Leap Year.");
			}
		}
		else
		{
			System.out.println("This Year is Not Leap Year.");
		}
	}
}
