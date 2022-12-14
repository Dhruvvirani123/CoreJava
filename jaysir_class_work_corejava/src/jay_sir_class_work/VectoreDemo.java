package jay_sir_class_work;

import java.util.Enumeration;
import java.util.Vector;

public class VectoreDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector dhruv = new Vector();
		dhruv.add(1);
		dhruv.add('D');
		dhruv.add("Dhruv");
		dhruv.add(12.23);
		dhruv.add(-12);
		dhruv.add(1);
		dhruv.add(1212212.1212);
		
		System.out.println(dhruv);
		System.out.println("Size of Vector : "+dhruv.size());
		System.out.println();
		
		dhruv.remove(2);
		System.out.println(dhruv);
		System.out.println("Size of Vector : "+dhruv.size());
		System.out.println();
		
		@SuppressWarnings("rawtypes")
		Enumeration em = dhruv.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
	}
}
