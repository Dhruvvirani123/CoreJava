package Learn.Opps;

class dh {
	void eat() {
		System.out.println("Eatting...");
	}
}

class dkd extends dh {
	void eat() {
		System.out.println("More Eating...");
	}
}

public class Multilevel_Inheritance {
	public static void main(String[] args) {
		dkd dv = new dkd();
		dv.eat();

		dh d = new dh();
		d.eat();
	}
}
