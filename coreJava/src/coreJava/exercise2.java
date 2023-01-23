package coreJava;

import java.util.Scanner;

public class exercise2 {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
		//Question 1
		
//		int a = 10;
//		if(a <= 12)
//		{
//			System.out.println("I am 11");
//		}
//		else {
//			System.out.println("I am not 11");
//		}
		
		//Question 2
		
//		float m1,m2,m3,total,per;
//		System.out.print("Enter your maths marks : ");
//		m1 = sc.nextFloat();
//		
//		System.out.print("Enter your Physics marks : ");
//		m2 = sc.nextFloat();
//		
//		System.out.print("Enter your chemistry marks : ");
//		m3 = sc.nextFloat();
//		
//		total = m1+m2+m3;
//		System.out.print("Total : "+total);
//		
//		System.out.println("");
//		per = total/3;
//		System.out.println("Per : "+per);
//		
//		if(per>=33 && m1>=33  && m2>=33  && m3>=33) {
//			System.out.println("Congratulation");
//		}
//		else
//		{
//			System.out.println("Sorry!!");
//		}
		
		//Question 3
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter : ");
		String website = sc.nextLine();
		if(website.endsWith(".org")) {
			System.out.println("organization website");
		}
		else if (website.endsWith(".com")) {
			System.out.println("Comricial website");
		}
		else if (website.endsWith(".in")) {
			System.out.println("Indian website");
		}
	}
}