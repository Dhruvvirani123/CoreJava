package jay_sir_class_work;
//1.try 2.catch 3.finally 4.throw 5.throws
import java.util.Scanner;

public class ExceptionHandling {
	public static void main(String[] args) {

		try {
			Scanner sc = new Scanner (System.in);
			System.out.print("Enter Number 1 : ");
			int i = sc.nextInt();
			System.out.print("Enter Number 2 : ");
			int j = sc.nextInt();
			int k = i/j;
			System.out.println("k = "+k);
			
		} catch (Exception e) {
			System.out.println("Denominator cannot Zero..");
		}
	}
}
