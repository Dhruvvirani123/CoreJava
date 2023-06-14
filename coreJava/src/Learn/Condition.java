package Learn;

public class Condition {
	public static void main(String[] args) {
		System.out.println("Nested If....");

		int marks = 70;

		if (marks < 50) {
			System.out.println("Fail...");
		} else if (marks >= 50 && marks < 60) {
			System.out.println("D Gread...");
		} else if (marks >= 60 && marks < 70) {
			System.out.println("C Gread...");
		} else if (marks >= 70 && marks < 80) {
			System.out.println("B Gread...");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("A Gread...");
		} else if (marks >= 90 && marks < 99) {
			System.out.println("A+ Gread...");
		} else {
			System.out.println("Invelid...");
		}
	}
}