package Learn.Opps;

interface drv {
	void a();

	void b();

	void c();

	void d();
}

abstract class dn implements drv {
	public void c() {
		System.out.println("I am c...");
	}
}

class z extends dn {
	public void a() {
		System.out.println("I am a...");
	}

	public void b() {
		System.out.println("I am b...");
	}

	public void d() {
		System.out.println("I am c...");
	}
}

public class Interface {
	public static void main(String[] args) {
		drv dv = new z();
	}
}