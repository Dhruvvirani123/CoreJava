package String;

public class compateTo_Method {

	public static void main(String[] args) {
		String s1 = "Dhruv";
		String s2 = "Virani";
		String s3 = "Patel";
		String s4 = "Dhruv";

		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s3));
		System.out.println(s2.compareTo(s1));
		System.out.println(s4.compareTo(s1));
	}
}