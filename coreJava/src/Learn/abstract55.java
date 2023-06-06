package Learn;

abstract class gaurang {
	abstract public void call();

	public void dhruv() {
		System.out.println("this is Dhruv");
	}

	public static void bhano() {
		System.out.println("this is bhano.");
	}
}

class punit extends gaurang {

	@Override
	public void call() {
		System.out.println("Punit Gaurang definations.");
	}

}

public class abstract55 {
	public static void main(String[] args) {
		punit ob = new punit();
		ob.call();
		ob.dhruv();
		ob.bhano();
		gaurang.bhano();
	}
}