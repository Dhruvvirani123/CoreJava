package Learn;

public class String_p {
	public static void main(String[] args) {
		String s1 = "Dhruv";
		String s2 = "Dk";
		
		System.out.println(s1.length());
		System.out.println(s2.length());
		
		System.out.println(s1.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s2.toUpperCase());
		
		System.out.println(s1.charAt(3));
		System.out.println(s2.charAt(0));
		
		System.out.println(s1.concat(s2));
		
		System.out.println(s1.contains(s2));
		
		System.out.println(s1.compareTo(s2));
		
		System.out.println(s1.compareToIgnoreCase(s2));
		
		System.out.println(s1.equals(s2));
		
		System.out.println(s1.equalsIgnoreCase(s2));
		
//		System.out.println(s1.isEmpty());
		
		System.out.println(s1.isBlank());
		
		System.out.println(s1.trim());
		
		System.out.println(s1.hashCode());
		
	}
}