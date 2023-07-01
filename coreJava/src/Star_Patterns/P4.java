package Star_Patterns;

public class P4 {
	public static void main(String[] args) {
		for (int i = 6 - 1; i >= 0; i--) {
			for (int j = 0; j <= i; j++) {
				System.out.print("*" + " ");
			}
			System.out.println();
		}
	}
}