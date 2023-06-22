package String;

public class indexOf_Method {
public static void main(String[] args) {
	String s1 = "This is index of example";

	int in1 = s1.indexOf("is");
	int in2 = s1.indexOf("index");
	System.out.println(in1+" " +in2);
	
	int in3 = s1.indexOf("is",4);
	System.out.println(in3);
	
	int in4 = s1.indexOf('s');
	System.out.println(in4);
}
}
