package String;

public class Immutable {
	public static void main(String[] args) {
		String name = "Dhruv";
		name.concat("Virani");/*
								 * Once String object is created its data or state can't be changed but a new
								 * String object is created.
								 */
		System.out.println(name);
		
		name = name.concat(" Virani");
		System.out.println(name);
	}
}
