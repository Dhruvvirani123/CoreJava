package Super_KeyWord;

class school {
	int id;
	String name = "Dv";
}

class teacher extends school {
	int id;
	String name;

	void printschoolname() {
		System.out.println("School name : " + super.name);
	}
}

public class Super_Refer {
	public static void main(String[] args) {
		teacher dv = new teacher();
		dv.printschoolname();
	}
}