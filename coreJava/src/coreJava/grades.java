package coreJava;

import java.util.Scanner;

public class grades {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter Marks : ");
		int drv = sc.nextInt();
		
		if(drv<=100 && drv>=91) {
			System.out.println("A+ grade");
		}
		else if(drv<=90 && drv>=81) {
			System.out.println("A grade");
		}
		else if(drv<=80 && drv>=71) {
			System.out.println("B grade");
		}
		else if(drv<=70 && drv>=61) {
			System.out.println("C grade");
		}
		else if(drv<=60 && drv>=51) {
			System.out.println("D grade");
		}
		else if(drv<=50 && drv>=41) {
			System.out.println("DD grade");
		}
		else{
			System.out.println("Fail");
		}
	}
}
