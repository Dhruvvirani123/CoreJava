package Learn;

import java.io.FileWriter;
import java.io.Writer;

public class File_Writer {
	public static void main(String[] args) {
		try {
			Writer w = new FileWriter("Output.txt");
			String co = "Dhruv Virani";
			w.write(co);
			w.close();
			System.out.println("Done");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}