package Learn.Opps;

class student {

	// Varible
	int id;
	String name;
	String city;

	// Behaviror : Member Methods : Methods : Function

	public void study() {
		System.out.println("Student name : " + "studying");
	}

	public void showfulldetils() {
		System.out.println("Student Id : " + id + " Student Name : " + name + " Student City : " + city);
	}
}

public class Class_Object {
	public static void main(String[] args) {
		student st1 = new student(); // new keyword : Daynemic memory alocated in java
		st1.id = 1;
		st1.name = "Dhruv";
		st1.city = "Amreli";
		st1.showfulldetils();
		st1.study();

	}
}
