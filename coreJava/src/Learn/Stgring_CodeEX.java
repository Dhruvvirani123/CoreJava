package Learn;

public class Stgring_CodeEX {
	public static void main(String[] args) {
		String s = "  Dhruv  ";
		System.out.println(s.strip());// strip() Method : white spaces removed
		System.out.println(s.trim());

		System.out.println(s.stripLeading());// stripLeading() method removes all the whitespaces only at the Leading
												// of the string.
		System.out.println(s.stripTrailing());// stripTrailing() method removes all the whitespaces only at the ending
												// of the string.
		s = s.repeat(3);
		System.out.println(s);
	}
}