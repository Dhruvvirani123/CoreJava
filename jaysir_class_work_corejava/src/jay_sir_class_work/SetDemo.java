package jay_sir_class_work;

import java.util.Enumeration;
//Set Not duplication in any user input
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("unused")
public class SetDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Set Virani = new HashSet<>();
		Virani.add(1);
		Virani.add('D');
		Virani.add(1);
		Virani.add(12.23);
		Virani.add(-12);
		Virani.add(1);
		Virani.add(12.23);
		
		System.out.println(Virani);
		System.out.println("Size of Set : "+Virani.size());
		
		Virani.remove(1);
		System.out.println(Virani);
		System.out.println("Size of Set : "+Virani.size());
	}
}
