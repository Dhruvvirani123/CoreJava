package Learn;

abstract class abc {
	abstract static void fun();
}

class bcd extends abc {
	static void fun() {
		System.out.println("Static abstract" + "method implemented");
	}
}

public class Abstract_Static {
	public static void main(String[] args) {
		bcd obj = new bcd();
		obj.fun();
	}
}
