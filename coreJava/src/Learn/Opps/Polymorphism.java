package Learn.Opps;

class bi {
	void run() {
		System.out.println("Running...");
	}
}

class bi2 extends bi {
	void run() {
		System.out.println("Running safely with 40km..");
	}
}

public class Polymorphism {
	public static void main(String[] args) {
		bi b = new bi2();
		b.run();
	}
}