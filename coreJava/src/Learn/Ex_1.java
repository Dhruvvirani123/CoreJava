package Learn;

class base {
	void method(int a) {
		System.out.println("Base class method called with Integer : " + a);
	}
}

class Derived extends base {
	void method(double d) {
		System.out.println("Base class method called with double : " + d);
	}
}

public class Ex_1 {
	public static void main(String[] args) {
		new Derived().method(12);
	}
}