package Learn;

abstract class Bike {
	Bike() {
		System.out.println("Bike is Created");
	}

	abstract void run();

	void changeGear() {
		System.out.println("Gear Changed");
	}
}

class Honda extends Bike {
	void run() {
		System.out.println("Running....");
	}
}

public class Abstract_constructor {
	public static void main(String[] args) {
		Bike b = new Honda();
		b.run();
		b.changeGear();
	}
}