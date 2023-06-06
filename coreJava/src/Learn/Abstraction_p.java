package Learn;

abstract class dh {
	void call() {
		System.out.println("Dh");
	}
}

class dk extends dh{
	void call() {
		System.out.println("DK");
	}
}

class tir extends dk {
	void bh() {
		super.call();
		System.out.println("Hello");
	}
}

public class Abstraction_p {
	public static void main(String[] args) {
		tir obj = new tir();
		obj.bh();
		obj.call();
	}
}