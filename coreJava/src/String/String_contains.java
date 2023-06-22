package String;

public class String_contains {

	public static void main(String[] args) {
		String s = "Dhruv Rasikbhai Virani";
		System.out.println(s.contains("ruv"));
		System.out.println(s.contains("virani"));
		System.out.println(s.contains("RasikBhai Virani"));//Case-sensitive
	}
}