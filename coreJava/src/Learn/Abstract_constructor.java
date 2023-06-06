package Learn;

abstract class Bike1 {
	Bike1() {
		System.out.println("Bike is Created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("Gear Changed");
	}
}

class Honda1 extends Bike1 {
	void run() {
		System.out.println("Running....");
	}
}

public class Abstract_constructor {
	public static void main(String[] args) {
		Bike1 b = new Honda1();
		b.run();
		b.changeGear();
	}
}