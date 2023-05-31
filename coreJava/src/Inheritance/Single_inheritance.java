package Inheritance;

//When a class inherits another class, it is known as a single inheritance

class animal {
	void eat() {
		System.out.println("Eating....");
	}
}

class dog extends animal {
	void bark() {
		System.out.println("Barking...");
	}
}

public class Single_inheritance {
	public static void main(String[] args) {
		dog d = new dog();
		d.eat();
		d.bark();
	}
}