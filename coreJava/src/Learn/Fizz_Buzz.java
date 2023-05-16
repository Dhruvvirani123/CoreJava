package Learn;

import java.util.Scanner;

public class Fizz_Buzz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int n = sc.nextInt();
		
		System.out.println("The Fizz, Buzz, and FizzBuzz numbers are : ");
		
		for(int i=1; i<=n; i++) {
			if(i%3==0 && i%5==0) {
				System.out.print("FizzBuzz");
			}
			else if(i%3==0) {
				System.out.print("Fizz");
			}
			else if(i%5==0) {
				System.out.print("Buzz");
			}
			else {
				System.out.print(i);
			}
			System.out.print(","+" ");
		}
		
		
		System.out.println();
		System.out.println();
		
///////////////////////////////////////////////////////////////////////////////////////////////////
		int num1 = 10_00_00_000;
		System.out.println(num1);
	}
}