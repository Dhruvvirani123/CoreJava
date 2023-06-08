package Learn;

import java.util.ArrayList;
import java.util.Iterator;

class student2 {
	String name;
	int roll;
	int age;

	student2(String name, int roll, int age) {
		this.name = name;
		this.roll = roll;
		this.age = age;
	}
}

public class class_object_in_arraylist {
	public static void main(String[] args) {
		student2 s1 = new student2("Dhruv", 1, 23);
		student2 s2 = new student2("DK", 2, 23);
		student2 s3 = new student2("Romil", 3, 25);
		student2 s4 = new student2("Tirth", 4, 23);

		// Creating Array

		ArrayList<student2> a = new ArrayList<student2>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);

		Iterator itr = a.iterator();
		while (itr.hasNext()) {
			student2 st = (student2) itr.next();
			System.out.println(st.name + " " + st.roll + " " + st.age);
		}
	}
}
