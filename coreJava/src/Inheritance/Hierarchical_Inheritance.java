package Inheritance;

class animal2 {
	void eat() {
		System.out.println("Eating....");
	}
}

class dog2 extends animal2 {
	void bark() {
		System.out.println("Barking...");
	}
}

class cat extends animal2 {
	void meow() {
		System.out.println("Mewoing....");
	}
}

public class Hierarchical_Inheritance {
	public static void main(String[] args) {
		cat c = new cat();
		c.eat();
		c.eat();
		c.meow();
	}
}
