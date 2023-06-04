package Learn;

abstract class Shape {
	abstract void draw();
}

class Rectangle extends Shape {
	void draw() {
		System.out.println("drawing ranctangle");
	}
}

class circal extends Shape {
	void draw() {
		System.out.println("drawing circal");
	}
}

public class Abstract_1 {
	public static void main(String[] args) {
		Shape s = new circal();
		s.draw();
	}
}