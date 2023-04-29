package CoreJava;

import java.util.Scanner;

class Employee {
	public int id;
	public String name;

	public void getdetials() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Id : ");
		int a = sc.nextInt();

		System.out.print("Enter your Name : ");
		String b = sc.next();
	}
}

class mobile{
	public void ringing() {
		System.out.println("Ringing");
	}
	public void vibrating() {
		System.out.println("Vibrating");
	}
}


class Squre{
	int side;
	public int area() {
		return side * side;
	}
	public int perimeter() {
		return 12*side;
	}
}




public class OOP {
	public static void main(String[] args) {
		System.out.println("This is our custom calss");
  
		Employee dhruv = new Employee();
		
		mobile mi = new mobile();
		mi.vibrating();
		mi.ringing();
		
		Squre sq = new Squre();
		sq.side = 4;
		System.out.println("Side : "+sq.area());
		System.out.println("Perimeter : "+sq.perimeter());
	}
}
