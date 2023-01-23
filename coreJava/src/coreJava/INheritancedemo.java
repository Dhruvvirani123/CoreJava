package coreJava;
//Inheritance = To access property of one class to another c
//types
//1.Single
//2.Mulrilevel
//3.Multiple
//4.Hierarchical
//5.Hybrid

class D{
	public void showAclass() {
		System.out.println("A class");
	}
}
class F extends D{
	public void showBclass() {
		System.out.println("B class");
	}
}
class C extends F{
	public void showCclass() {
		System.out.println("C Class");
	}
}
public class INheritancedemo {
	public static void main(String[] args) {
		F f = new F();
		f.showAclass();
		f.showBclass();
		C c = new C();
		c.showAclass();
		c.showBclass();
		c.showCclass();
	}
}
