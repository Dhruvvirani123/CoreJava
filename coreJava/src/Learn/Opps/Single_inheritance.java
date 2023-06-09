package Learn.Opps;

class dhruv {
	void eat() {
		System.out.println("Eating...");
	}
}

class dk extends dhruv {
	void eat() {
		System.out.println("More Time Eating...");
	}
}

public class Single_inheritance {
	public static void main(String[] args) {
		dk d = new dk();
		d.eat();

		dhruv dv = new dhruv();
		dv.eat();
	}
}
