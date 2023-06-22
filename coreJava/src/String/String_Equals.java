package String;

public class String_Equals {
	public static void main(String[] args) {
		String s1 = "Dhruv";
		String s2 = "Virani";
		String s3 = "Romilbhai";
		String s4 = "Dhruv";

		System.out.println(s1.equals(s3));
		System.out.println(s1.equals(s4));
		
		System.out.println(s1 == s4);
	}
}