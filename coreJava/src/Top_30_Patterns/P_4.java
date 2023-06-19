package Top_30_Patterns;

import java.util.Scanner;

public class P_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number : ");
		int row = sc.nextInt();
		for (int i = 1; i < row; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}
}