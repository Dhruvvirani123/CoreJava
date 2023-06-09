package Learn.Opps;

abstract class shape {
	abstract void draw();
}

class re extends shape {
	void draw() {
		System.out.println("Drawing rectangle...");
	}
}

class rd extends shape {
	void draw() {
		System.out.println("Drawing Circle...");
	}
}

public class Abstract_Shape {
	public static void main(String[] args) {
		shape s = new rd();
		s.draw();

		re s1 = new re();
		s1.draw();
	}
}
