package Learn.Opps;

class dr {
	void eat() {
		System.out.println("Eating...");
	}
}

class dv extends dr {
	void bark() {
		System.out.println("Barking...");
	}
}

class dd extends dr {
	void mino() {
		System.out.println("Meow....");
	}
}

public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		dd dv = new dd();
		dv.eat();
		dv.mino();
	}
}
