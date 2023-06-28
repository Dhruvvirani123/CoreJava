package Learn;

class student {
	int rollno;
	String name;
	float fee;

	student(int rollno, String name, float fee) {
		this.fee = fee;
		this.name = name;
		this.rollno = rollno;
	}

	void disply() {
		System.out.println(name + " " + rollno + " " + fee);
	}
}

public class This {
	public static void main(String[] args) {
		student s = new student(200, "Dhruv", 15000);
		student s1 = new student(300, "Dk", 15000);
		s.disply();
		s1.disply();
		getterandsetter s2 = new getterandsetter();
	}
}