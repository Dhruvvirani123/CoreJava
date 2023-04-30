package CoreJava;

class A {
	public int a;

	public int dhruv() {
		return 2;
	}

	public void meth2() {
		System.out.println("I am method 2 of class A...");
	}
}

class b extends A {
	public void meth() {
		System.out.println("I am method 3 of class B...");
	}
}

public class Method_overriding {
	public static void main(String[] args) {
		A a = new A();
		a.meth2();

		b b = new b();
		b.meth2();
	}
}
