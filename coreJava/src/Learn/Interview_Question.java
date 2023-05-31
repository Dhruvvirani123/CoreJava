package Learn;

public class Interview_Question {
	public static void main(String[] args) {

		System.out.println("Q.1");
		System.out.println(10 + 10 + "Dhruv");
		System.out.println("Dhruv" + 10 + 10);// Output ?

		System.out.println(10 * 20 + "Dhruv");
		System.out.println("Dhruv" + 10 * 20);/*
												 * Output ? because the precedence of the multiplication is higher than
												 * addition.
												 */

		System.out.println("Dhurv" + 10 / 2);
		System.out.println(10 / 2 + "Dhruv");// Output ?

		System.out.println();

		System.out.println("Q.2");

		for (int i = 1; i <= 5; i++) {
			System.out.println("Dhruv");
		}

		System.out.println();

		System.out.println("Q.3");
		
		
	}
}