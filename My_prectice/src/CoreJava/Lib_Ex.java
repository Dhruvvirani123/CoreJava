package CoreJava;

class circle {
	public int redius;

	circle(int a) {
		System.out.println("I am circel parameterized constructor....");
		this.redius = a;
	}

	public double area() {

		return Math.PI * this.redius * this.redius;
	}
}

class cylinder extends circle {
	cylinder(int a, int h) {
		super(a);
		System.out.println("I am cylinder perameterzed constructor....");
		this.height = h;
	}

	public int height;

	public double volume() {
		return Math.PI * this.redius * this.redius * height;
	}
}

public class Lib_Ex {
	public static void main(String[] args) {

		//circle obj = new circle(12);
		 cylinder obj = new cylinder(12,4);
	}
}