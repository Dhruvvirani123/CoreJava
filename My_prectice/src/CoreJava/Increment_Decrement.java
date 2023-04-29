package CoreJava;

public class Increment_Decrement {
	public static void main(StringDemo[] args) {
		
		int a = 60;
		
		System.out.println(a++);
		System.out.println(a);
		
		System.out.println(++a);
		System.out.println(a);
		
		System.out.println(a--);
		System.out.println(a);
		
		System.out.println(--a);
		System.out.println(a);
		
		
		int y = 7;
		int x = ++y * 8;  //y = 8 * 8 = 64
		System.out.println(x);
		
		 
		char d = 'a';
		System.out.println(++d);
	}
}
