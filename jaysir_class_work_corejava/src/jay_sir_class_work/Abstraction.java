package jay_sir_class_work;

//import java.nio.file.attribute.AclEntry;

abstract class RBI{
	public abstract void interest();
	public abstract void homelone();
	public void reporate() {
		System.out.println("RBI Reporate : +-4.25%");
	}
}

class SBI extends RBI{
	public void interest() {
		System.out.println("SBI interest : 5%");
	}
	public void homelone() {
		System.out.println("SBI homelone interest : 7%");
	}
}

class PNB extends RBI{
	public void interest() {
		System.out.println("PNB interest : 5%");
	}
	public void homelone() {
		System.out.println("PNB homelone interest : 7%");
	}
}

class Kotak extends RBI{
	public void interest() {
		System.out.println("Kotak Interest : 7%");
	}
	public void homelone() {
		System.out.println("Kotak homelone interest : 8%");
	}
}

public class Abstraction {
	public static void main(String[] args) {
		PNB p = new PNB();
		p.interest();
		p.homelone();
		p.reporate();
		
		System.out.println();
		SBI s = new SBI();
		s.interest();
		s.homelone();
		s.reporate();
		
		System.out.println();
		Kotak j = new Kotak();
		j.interest();
		j.homelone();
		j.reporate();
	}
}
