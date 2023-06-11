package Exception;

public class E1 {
	public static void main(String[] args) {
		try {
			int data = 50 / 0;
		} catch (Exception e) {
			System.out.println("Can not divided by Zero..");
		}
	}
}