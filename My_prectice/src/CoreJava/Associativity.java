package CoreJava;

public class Associativity {
	public static void main(StringDemo[] args) {
		int a = 6*5-34/2;
		System.out.println(a);
		
//		30-34/2   ----> Ex. Presidence
//		30-17
//		=13
		
		int b = 60/5-34*2;
		
//		12-34*2   ----> Ex. Associativity 
//		12-68
//		=-56
		
		System.out.println(b);
	}
}
