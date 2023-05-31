package Learn;

class base {
	public int add(int a, int b) {
		System.out.println("In the base class.");
		return a + b;
	}

	public static void dhruv() {
		System.out.println("In the base class.");
	}
}

class derived extends base {
	public int add(int a, int b) {
		System.out.println("In the child class.");
		return a + b;
	}

	public static void dhruv() {
		System.out.println("In the Child class.");
	}
}

public class Static_Method {

	public static void main(String[] args) {
		base obj = new base();
		System.out.println(obj.add(5, 5));
		obj.dhruv();
	}
}