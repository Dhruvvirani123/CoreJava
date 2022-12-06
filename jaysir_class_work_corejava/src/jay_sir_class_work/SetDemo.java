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
		Set set = new HashSet<>();
		set.add(1);
		set.add('D');
		set.add(1);
		set.add(12.23);
		set.add(-12);
		set.add(1);
		set.add(12.23);
		
		System.out.println(set);
		System.out.println("Size of Set : "+set.size());
		
		set.remove(2);
		System.out.println(set);
		System.out.println("Size of Set : "+set.size());
	}
}
