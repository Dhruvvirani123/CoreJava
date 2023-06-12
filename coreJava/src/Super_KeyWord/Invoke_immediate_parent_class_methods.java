package Super_KeyWord;

class school1 {
	int id = 1;
	String name = "Dv";

	void printid() {
		System.out.println("School ID : " + this.id);
	}
}

class te extends school1 {
	int id = 10;

	void printschoolname() {
		System.out.println("School name : " + super.name);
	}

	void printid() {
		System.out.println("Teacher ID : " + this.id);
	}
}

public class Invoke_immediate_parent_class_methods {
	public static void main(String[] args) {
		te t = new te();
		t.printid();
		t.printschoolname();
	}
}