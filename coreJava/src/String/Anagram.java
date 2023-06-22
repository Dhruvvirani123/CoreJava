package String;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Any name : ");
		String s1 = sc.next();
		System.out.print("Enter nay Name : ");
		String s2 = sc.next();

//		String s1 = "Dhruv";
//		String s2 = "Drhvu";

		if (s1.length() == s2.length()) {
			char[] charArray1 = s1.toCharArray();
			char[] charArray2 = s2.toCharArray();

			Arrays.parallelSort(charArray1);
			Arrays.parallelSort(charArray2);

			boolean result = Arrays.equals(charArray1, charArray2);

			if (result) {
				System.out.println(s1 + " and " + s2 + " are Anagram.");
			} else {
				System.out.println(s1 + " and " + s2 + " are not Anagram.");
			}
		} else {
			System.out.println(s1 + " and " + s2 + " are not anagram.");
		}

	}
}