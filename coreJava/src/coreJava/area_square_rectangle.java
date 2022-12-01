package coreJava;

import java.util.Scanner;

class area{
	Scanner sc = new Scanner (System.in);
	public void output (float l, float b) {
		System.out.println("Enter Area of Rectangle is : "+l*b);
	}
	void output (float a) {
		System.out.println("Enter Area of Square is : "+a*a);
	}
}
public class area_square_rectangle {
	public static void main(String[] args) {
		area h1 = new area();
		h1.output(12,3);
		h1.output(34,1);
		
	}
}
