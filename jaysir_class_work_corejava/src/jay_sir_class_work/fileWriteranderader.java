package jay_sir_class_work;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class filewriteranderader {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner (System.in); 
		FileWriter dh = new FileWriter("Virani.txt");
		String d = "This is another way to file handling\n";
		
		System.out.print("Enter String : ");
		String s = sc.nextLine();
		
		System.out.print("Enter A : ");
		float a = sc.nextFloat();
		
		System.out.print("Enter B : ");
		float b = sc.nextFloat();
		
		float sum;
		sum = a + b;
		System.out.print("The Sum is : "+sum);
		
		dh.write(d);
		dh.write(s);
		dh
		dh.flush();
		dh.close();
		
		System.out.println("\nDone");
		
		FileReader v = new FileReader("Virani.txt");
		int i;
		while((i = v.read())!=-1);
	}
}