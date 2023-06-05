package Learn;

interface ptint {
	void print();
}

class a implements ptint {
	public void print() {
		System.out.println("Hello");
	}
}

public class Interface {
	public static void main(String[] args) {
		a a = new a();
		a.print();
	}
}