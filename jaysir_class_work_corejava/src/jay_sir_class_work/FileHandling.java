package jay_sir_class_work;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;


public class FileHandling 
{
	public static void main(String[] args) throws IOException 
	{
		String s = "File handling bt FOS an FIS";
		FileOutputStream fos = new FileOutputStream("dhruv.txt");
		byte[] b = s.getBytes();
		fos.write(b);
		fos.flush();
		fos.close();
		System.out.println("Data written in file Successfully...");
		
		FileInputStream fis = new FileInputStream("dhruv.txt");
		int i;
		while((i=fis.read())!=-1) 
		{
			System.out.print((char)i);    		//<--Typecasting
		}
		fis.close();
	}
}
