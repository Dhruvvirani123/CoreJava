package String;

public class equalIgnorCase {

	public static void main(String[] args) {
		String s1 = "Dhruv";
		String s2 = "Virani";
		String s3 = "Romil";
		String s4 = "dhruv";// equalsIgnoreCase not case sensitive

		System.out.println(s1.equalsIgnoreCase(s2));
		System.err.println(s1.equalsIgnoreCase(s3));
		System.out.println(s2.contentEquals(s3));
		System.out.println(s1.equalsIgnoreCase(s4));
	}
}