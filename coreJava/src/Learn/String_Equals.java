package Learn;

public class String_Equals {
	public static void main(String[] args) {
		String s1 = "Coding Dhruv";
		String s2 = new String("Coding Dhruv");

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

//		char ch[] = { 'D', 'h', 'r', 'u', 'v' };
//		String ch1 = new String(ch);
//		System.out.println(ch);
		
	}
}