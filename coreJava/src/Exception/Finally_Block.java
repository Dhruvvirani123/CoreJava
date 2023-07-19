package Exception;

public class Finally_Block {
	public static void main(String[] args) {
		try {
			int a = 10 / 0;
			System.out.println(a);
		} catch (Exception e) { // Catch block is compulsory
			e.printStackTrace();
		} finally {
			System.out.println("Finally BLock Executed");
		}
	}
}