package Learn;

class parent {
	public int num = 1;

	parent() {
		System.out.println("Parent class default constructor");
	}

	parent(String x) {
		System.out.println("Parent class parameterised constructor");
	}

	public void foo() {
		System.out.println("Parent class foo!");
	}
}

class child extends parent {
	private int num = 2;

	child() {
		super("call parent");
		System.out.println("Child class default constructor");
	}

	void printNum() {
		System.out.println(num);
		System.out.println(super.num);
	}

	public void foo() {
		System.out.println("child class foo!");
		super.foo();
	}
}

public class Super_Keyword {
	public static void main(String[] args) {
		child c = new child();
		c.foo();
	}
}