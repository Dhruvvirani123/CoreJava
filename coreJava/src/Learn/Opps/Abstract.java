package Learn.Opps;

abstract class bike {
	abstract void run();
}

class h extends bike {
	void run() {
		System.out.println("Running Safely...");
	}
}

public class Abstract {
	public static void main(String[] args) {
		bike bike = new h();
		bike.run();
	}
}