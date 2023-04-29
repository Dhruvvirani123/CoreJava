package CoreJava;

import java.util.Scanner;

public class Ex_1 {
	public static void main(StringDemo[] args) {
	
		Scanner sc = new Scanner(System.in);    //System.in is User Keybord Input
		
//		System.out.print("Enter Sub 1 Marks : ");
//		float sub1 = sc.nextFloat();
//		
//		System.out.print("Enter Sub 2 Marks : ");
//		float sub2 = sc.nextFloat();
//		
//		System.out.print("Enter Sub 3 Marks : ");
//		float sub3 = sc.nextFloat();
//		
//		float sum;
//		sum = sub1 + sub2 + sub3;
//		System.out.println("Total Marks is : "+sum);
//		
//		float per;
//		per = sum/30;
//		System.out.println("Per : "+per);
//		
//		System.out.println();
//		System.out.println();
		
		
//		System.out.print("Enter Your Name : ");
//		String dv = sc.nextLine();
//		System.out.println("Hello "+dv+ " Have a Nice Day......");
		
		System.out.print("Enter KM : ");
		float dv = sc.nextFloat();
		
		float mil;
		mil = (float) (dv * 0.621371);
		System.out.println(mil);
	}
}