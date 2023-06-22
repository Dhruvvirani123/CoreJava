package String;

public class String_Split {
	public static void main(String[] args) {
		String s = "total number of words in a string excluding";
		String[] words = s.split("\\s"); // splits the string based on whitespace
		for (String w : words) {
			System.out.println(w);
		}
	}
}