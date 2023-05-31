package Inheritance;

class animal1 {
	void eat() {
		System.out.println("Eating....");
	}
}

class dog1 extends animal1 {
	void bark() {
		System.out.println("Barking...");
	}
}

class babydog extends dog1 {
	void weep() {
		System.out.println("Weeping....");
	}
}

public class Multilevel_Inheritance {
	public static void main(String[] args) {
		babydog d = new babydog();
		d.bark();
		d.eat();
		d.weep();
	}
}
