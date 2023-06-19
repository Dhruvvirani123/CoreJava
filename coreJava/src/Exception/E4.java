package Exception;

public class E4 {
	public static void main(String[] args) {
		try {
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);

			System.out.println(10 / 0);

			System.out.println(6);
			System.out.println(7);
			System.out.println(8);
			System.out.println(9);
			System.out.println(10);

		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("dhruv");
	}

}