package Learn;

import java.util.HashMap;

public class MapExample {
	public static void main(String[] args) {
		HashMap<String, Integer> courses = new HashMap<String, Integer>();
		courses.put("Java", 5);
		courses.put("C++", 2);
		courses.put("Javascript", 3);
		courses.put("Spring", 1);
		courses.put("Hibernate", 8);//output order not mainain
		System.out.println(courses);
		System.out.println(courses.get("Java"));//Duration Display
	}
}
