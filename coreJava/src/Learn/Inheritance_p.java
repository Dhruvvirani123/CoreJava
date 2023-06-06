package Learn;

interface b {
	void print();
}

interface c {
	void print();
}

abstract class d implements b, c {
	void call() {

	}

	public void print() {

	}
}

class f extends d {
	void call() {
		System.out.println("Hello");
	}

	@Override
	public void print() {
		System.out.println("dhruv");
	}
}

public class Inheritance_p {
	public static void main(String[] args) {
		f ob = new f();
		ob.call();
		ob.print();
	}
}