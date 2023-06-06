package Learn;

abstract class darshan {
	abstract public void call();
}

class dhruv extends darshan {

	@Override
	public void call() {
		System.out.println("This is call method");
	}

	public void call(int a) {
		System.out.println("This is parameter call method");
	}
}

class piyush extends dhruv {
	public void dog() {
		super.call(4);
		super.call();
		super.call(5);
		System.out.println("This is...");
	}
}

public class abstract456 {
	public static void main(String[] args) {
		piyush pu = new piyush();
		pu.call();
		pu.call();
		pu.call(5);
		pu.dog();
	}
}