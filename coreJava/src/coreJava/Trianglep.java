package coreJava;

class triangle1 {
	 triangle1(int a,int b,int c) {
		int area = (int) (0.5*a*b);
		System.out.print("Area of Tringle : "+area+"\n");
		
		int per = a+b+c;
		System.out.print("Perimeter of Tringle : "+per);
	}
}
public class Trianglep {
	public static void main(String[] args) {
		int a = 3, b = 4, c = 5;
		triangle1 obj = new triangle1(a,b,c);
	}
}
