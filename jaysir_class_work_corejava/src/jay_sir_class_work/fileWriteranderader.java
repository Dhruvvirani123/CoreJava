package jay_sir_class_work;

import java.io.FileWriter;
import java.io.IOException;

public class fileWriteranderader {
	public static void main(String[] args) throws IOException {
		FileWriter fr = new FileWriter("Virani.txt");
		String s = "This is another way to filr handling";
		fr.write(s);
		fr.flush();
		fr.close();
		System.out.println("Done");
		
		FileWriter f = new FileWriter("Virani.txt");
		
		int i;
		while((i=f.read())!=-1)
		{
			System.out.println((char)i);
		}
		f.close();

	}
}
