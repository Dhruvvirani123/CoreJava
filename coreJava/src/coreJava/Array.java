package coreJava;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}	

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Size of Erray : ");
		int size = sc.nextInt();
		
		int arr2[] = new int[size];
		for(int i=0;i<arr2.length;i++)
		{	
			System.out.print("Enter Element at arr["+i+"] is : ");
			arr2[i] = sc.nextInt();		
		}
		System.out.println("");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println("Enter Element at arr["+i+"] is : "+arr2[i]);
		}
		
		System.out.println("");
		int sum = 0;
		for(int i=0;i<arr.length;i++)
		{
			sum = sum + arr2[i];
		}
		System.out.println("Sum : "+sum);
		
		System.out.println("");
		
		int counter = 0;
		int i;
		System.out.print("Enter number to search in array : ");
		int num = sc.nextInt();
		for(i=0;i<arr2.length;i++)
		{
			if(num == arr2[i])
			{
				counter++;
				break;
			}
		}
		if(counter == 1)
		{
			System.out.print("Yes Exist at i : "+i);
		}
		else
		{
			System.out.println("Not Exist");
		}
	}
}
