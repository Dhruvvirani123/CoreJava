package Learn;

public class Execption {
	public static void main(String[] args) {
		try {
			int a = 1 / 0;
			System.out.println("A = " + a);
		} catch (Exception e) {
			System.out.println(e);
		} catch (ArithmeticException ex) {
			System.out.println(ex);
		}
	}

}
