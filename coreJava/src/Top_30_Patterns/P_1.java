package Top_30_Patterns;

public class P_1 {
	public static void main(String[] args) {
		int i, j, num=1, n = 5;
		for (i = 0; i < n; i++) {
			num = 1;
			for (j = 0; j <= i; j++) {
				System.out.print(num + " ");
				num++;
			}
			System.out.println();
		}
	}
}
