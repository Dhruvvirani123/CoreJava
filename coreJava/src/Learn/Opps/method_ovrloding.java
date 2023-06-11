package Learn.Opps;

class adder { // Same method name but different parameters it's call method overloading.
	static int add(int a, int b) {
		return a + b;
	}

	static int add(int a, int b, int c) {
		return a + b + c;
	}
}

public class method_ovrloding {
	public static void main(String[] args) {
		System.out.println(adder.add(11, 22));
		System.out.println(adder.add(22, 23, 12));
	}
}