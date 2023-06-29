package Exception;

public class E5 {
	public static void main(String[] args) {
		try {
			int data = 50/0;
		}
		catch (Exception e) {
			System.out.println(e);
			//System.out.println("Can't Dividedd by Zero");
		}
		System.out.println("Can't Dividedd by Zero");
	}
}
