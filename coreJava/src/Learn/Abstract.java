package Learn;

abstract class bike {
	abstract void run();
}

class honda extends bike {
	void run() {
		System.out.println("Running");
	}
}

public class Abstract {
	public static void main(String[] args) {
		bike b = new honda();
		b.run();
	}
}
