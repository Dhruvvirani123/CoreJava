package jay_sir_class_work;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("unused")
public class filewriteranderader {
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner (System.in); 
		FileWriter dh = new FileWriter("Virani.txt");
		String d = "This is Another Way to file Handling\n";
		
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		
		dh.write(d);
		dh.write(s);
		dh.flush();
		dh.close();
		
		System.out.println("Done");
	}
}