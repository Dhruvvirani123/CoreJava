package CoreJava;

import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter 0 for Rock, 1 for Paper, 2 for seissor : ");
		int userinput = sc.nextInt();
		
		Random ran = new Random();
		int computerinput = ran.nextInt();
		
		if (userinput == computerinput) {
			System.out.println("Draw");
		}
		else if(userinput == 0 && computerinput == 2 || userinput == 1 && computerinput == 0 || userinput == 2 && computerinput == 1) {
			System.out.println("You Win.....");
		}
		else {
			System.out.println("Computer Win......");
		}
		System.out.println("Computer Choice : "+computerinput);
	}
}
