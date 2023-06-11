package Exception;

import java.io.PrintWriter;

public class E3 {
	public static void main(String[] args) {
		PrintWriter pw;
		try {
			pw = new PrintWriter("dhruv.txt");
			pw.println("Saved");

		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println("File saved....");
	}
}