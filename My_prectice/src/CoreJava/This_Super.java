package CoreJava;

class ab {
	int a;

	public int getA() {
		return a;
	}

	public ab(int v) {
		this.a = v;
	}

	public int returnone() {
		return 1;
	}
}

class cd extends ab {

	public cd(int v) {
		super(v);
		System.out.println("me ak constructor hoooo...");
	}

}

public class This_Super {
	public static void main(String[] args) {
		ab a = new ab(85);
		cd d = new cd(1);
		System.out.println(a.getA());
	}
}
