package CoreJava;

import java.util.Scanner;

public class Conditional_Statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int age;
//		
//		System.out.print("Enter your Age : ");
//		age = sc.nextInt();
//		
//		if (age>=18) {
//			System.out.println("You can Drive....");
//		}
//		else {
//			System.out.println("You can not Drive!!!!");
//		}

//		boolean a = true;
//		boolean b = false;
//		
//		if (a || b) {
//			System.out.println("True");
//		}
//		else {
//			System.err.println("Flase");   // ||  True
//		}

////////////////////////////////////////////////////////////
//		if (a && b) {
//			System.out.println("True");
//		}
//		else {
//			System.out.println("False"); // && False
//		}

//		System.out.print("Enter Sub 1 Marks : ");
//		int a = sc.nextInt();
//		
//		System.out.print("Enter Sub 2 Marks : ");
//		int b = sc.nextInt();
//		
//		System.out.print("Enter Sub 3 Marks : ");
//		int c = sc.nextInt();
//		
//		int sum;
//		sum = a+b+c;
//		System.out.print("Total Marks :"+sum);
//		
//		System.out.println();
//		int per;
//		per = sum/3;
//		System.out.print("Per is : "+per);
//		System.out.println();
//		
//		if (per>70) {
//			System.out.println("v.Good...");
//		}
//		else if (per>60) {
//			System.out.println("Good");
//		}
//		else if (per>50) {
//			System.out.println("....");
//		}
//		else if (per>40) {
//			System.out.println("!!!!!");
//		}
//		else {
//			System.out.println("Sorry Fail");
//		}

//		byte m1,m2,m3;
//		System.out.print("Enter your Physics Marks : ");
//		m1 = sc.nextByte();
//		
//		System.out.print("Enter your Chemistry Marks : ");
//		m2 = sc.nextByte();
//		
//		System.out.print("Enter your Mathes Marks : ");
//		m3 = sc.nextByte();
//		
//		float avg = (m1+m2+m3)/3.0f;
//		if (avg>=40 && m1>=33 && m2>=33 && m3>=33){
//			System.out.println("Good");
//		}
//		else {
//			System.out.println("Try Again...");
//		}

//		System.out.print("Enter your Website : ");
//		String web = sc.next();
//		if (web.endsWith(".org")) {
//			System.out.println("Organization Website..");
//		}
//		else if (web.endsWith(".in")) {
//			System.out.println("Indian Website..");
//		}
//		else if (web.endsWith(".com")) {
//			System.out.println("Commercial Website..");
//		}
//		else {
//			System.out.println("Invalid Input!!!");
//		}

//		for(int i=5; i>0; i--) {
//			System.out.println(i); // Compil : 5 4 3 2 1
//		}

//		int n = 4;
//		for(int i=n; i>0; i--) {
//			for(int j=0; j<i; j++) {
//				System.out.print(" *");
//			}
//			System.out.print("\n");
//		}

//		int sum = 0;     //First Even Number sum
//		int n = 3;
//		for(int i=0;i<n;i++) {
//			sum = sum + (2*i);
//		}
//		System.out.println(sum);

//		//Table
		int n = 10;
		int sum = 0;
		for(int i=1; i<=10; i++) {
			System.out.printf("%d * %d = %d\n", n,i,n*i);
			sum += n*i;
		}
		System.out.println(sum);
		
//		
//		System.out.println();
//		int m = 10;
//		for(int j=10; j>=1; j--) {
//			System.out.printf("%d * %d = %d\n",m,j,m*j); //Revers Order Table
//		}

	}
}