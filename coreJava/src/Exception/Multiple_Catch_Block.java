package Exception;

public class Multiple_Catch_Block {
	public static void main(String[] args) {
		try {
			int a[] = new int[5];
			a[5] = 30 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception occurs...");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs...");
		}
		catch (Exception e) {
			System.out.println("ArrayIndexOutOfBoundsException occurs...");
		}
	}
}
