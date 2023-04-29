package CoreJava;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		
		// classroom of 500 students - you have to store marks of these 500 students

//		int [] marks = new int[5];
//		marks[0] = 100;
//		marks[1] = 90;
//		marks[2] = 70;
//		marks[3] = 60;
//		marks[4] = 100;
//		System.out.println(marks[4]);

		//int[] marks = { 98, 99, 89, 87 };
//		System.out.println(marks[2]);
//		System.out.println(marks.length);

		// Displaying the array (for loop)
//		for (int i = 0; i < marks.length; i++) {
//			System.out.println(marks[i]);
//		}
//
//		System.out.println("Revers Order........");
//		for (int i = marks.length - 1; i >= 0; i--) {
//			System.out.println(marks[i]);
//		}
//		
//		//For each Loop
//		System.out.println("For Each loop");
//		for(int element:marks) {
//			System.out.println(element);
//		}
//
//		
//		int [] marks1; //A 1-D Array
//		int [][] flats; //A 2-D Array
//		
//		System.out.println("2-D Array...");
//		flats = new int [3][4]; //Flat in 3 flore in 4 H
//		flats [0][0] = 101;
//		flats [0][1] = 102;
//		flats [0][2] = 103;
//		flats [0][3] = 104;
//		
//		flats [1][0] = 203;
//		flats [1][1] = 204;
//		flats [1][2] = 203;
//		flats [1][3] = 204;
//		
//		flats [2][0] = 303;
//		flats [2][1] = 304;
//		flats [2][2] = 303;
//		flats [2][3] = 304;
//		
//		for(int i=0;i<flats.length;i++) {
//			for(int j=0;j<flats[i].length;j++) {
//				System.out.print(flats[i][j]);
//				System.out.print(" ");
//			}
//			System.out.print("\n");
//		}
		
		
		
//		float [] marks = {12.90f, 13.99f, 89.89f, 99.90f};
//		float sum = 0;
//		for(float element:marks) {
//			sum = sum + element;
//		}
		//System.out.println("The sum is : "+sum);
		
		float [] marks = {12.90f, 13.99f, 89.89f, 99.90f};
		float num = 12.91f;
		boolean array = false;
		for(float element:marks) {
			if(num==element) {
				array = true;
				break;
			}
		}
		if(array) {
			System.out.println("The Value is present in this array...");
		}
		else {
			System.out.println("The Value is not present in this array...");
		}
	}
}