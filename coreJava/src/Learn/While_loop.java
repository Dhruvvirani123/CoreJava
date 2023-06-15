package Learn;

import java.util.Scanner;

public class While_loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i = i + 1;
		}

		System.out.print("Enter Any Year : ");
		int year = sc.nextInt();
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Leap Year...");
		} else {
			System.out.println("Common Year");
		}
	}
}