package jay_sir_class_work;

import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {
		
		int i,j,k;
		try {
			
			Scanner sc = new Scanner (System.in);
			System.out.print("Enter Number 1 : ");
			i = sc.nextInt();
			System.out.print("Enter Number 2 : ");
			j = sc.nextInt();
			k = i/j;
			k = i+j;
			k = i-j;
			k = i*j;
			System.out.println("k = "+k);
			
		} catch (Exception e) {
			System.out.println("Denominator cannot Zero..");
		}
	}
}
