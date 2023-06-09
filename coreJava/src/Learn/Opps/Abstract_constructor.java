package Learn.Opps;

abstract class bk {
	bk() {
		System.out.println("Bike is Created..");
	}

	abstract void run();

	void changeGear() {
		System.out.println("Gear Changed...");
	}
}

class hon1 extends bk {
	void run() {
		System.out.println("Running safely...");
	}
}

public class Abstract_constructor {
	public static void main(String[] args) {
		bk ob = new hon1();
		ob.run();
		ob.changeGear();
	}
}