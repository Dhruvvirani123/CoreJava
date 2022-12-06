package coreJava;
import java.util.Scanner;
public class greatest_number_ass {
	public static void main(String[] args) {
	
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Enter a First number : ");
		int A = sc.nextInt();
		
		System.out.print("Enter a Secound Number : ");
		int B = sc.nextInt();
		
		System.out.print("Enter a Third Number : ");
		int C = sc.nextInt();
		
		if(A > B)
		{
			if(A > C)
			{
				System.out.println("The Greatest Number is : "+A);
			}
		}
		if(B > A)
		{
			if(B > C)
			{
				System.out.println("The Greatest Number is : "+B);
			}
		}
		if(C > A)
		{
			if(C > B)
			{
				System.out.println("The Greatest Number is : "+C);
			}
		}
	}
}
