package coreJava;

import java.util.Enumeration;
import java.util.Vector;

public class vectoreper {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		Vector virani = new Vector<>();
		
		virani.add("Dhruv");
		virani.add('D');
		virani.add(12.25);
		virani.add(1212121);
		virani.add(-12);
		virani.add(12.25);
		
		System.out.println(virani);
		System.out.println("Size of Vector : "+virani.size());
		
		virani.remove(3);
		System.out.println(virani);
		System.out.println("Size of Vector : "+virani.size());
		
		System.out.println();
		@SuppressWarnings("rawtypes")
		Enumeration dh = virani.elements();
		while(dh.hasMoreElements())
		System.out.println(dh.nextElement());
	}
}
