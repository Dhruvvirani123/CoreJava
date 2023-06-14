package Learn;

public class While_loop {
	public static void main(String[] args) {
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i = i + 1;
		}

		int year = 2020;
		if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("Leap Year...");
		} else {
			System.out.println("Common Year");
		}
	}
}