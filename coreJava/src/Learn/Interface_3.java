package Learn;

interface p {
	void print();
}

interface cd extends p {
	void print();
}

class dvd implements cd {
	public void print() {
		System.out.println("Hello");
	}
}

public class Interface_3 {
	public static void main(String[] args) {
		dvd dvd = new dvd();
		dvd.print();
	}
}