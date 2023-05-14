package Learn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {
	public static void main(String[] args) {
		ArrayList<String> name = new ArrayList<String>();
		name.add("Dhruv");
		name.add("DK");
		name.add("Tirth");
		name.add("Piyush");
		name.add("Dhruv");

		// for-each loop:

		for (String str : name) {
			System.out.println(str + "\t-> " + str.length() + "\t");
			StringBuffer br = new StringBuffer(str);
			System.out.println(br.reverse());// Revers name print thashe
		}
		System.out.println("-------------------------------------------------");

		// traversing using Iterator
		Iterator<String> itr = name.iterator();
		while (itr.hasNext()) {
			String next = itr.next();
			System.out.println(next);

		}
		System.out.println("++++++++++++++++++++++++==");
		// backward traversal of collection Listiterator
		ListIterator<String> litr = name.listIterator(name.size());
		while (litr.hasPrevious()) {
			String privious = litr.previous();
			System.out.println(privious);  //Ultu print thashe
		}

//////////////////////////////////////////////////////////////////////////////////////////////////
		System.out.println("+++++++++++++++");
		
		TreeSet<String> set = new TreeSet<String>();
		set.addAll(name);
		set.forEach(e->{
			System.out.println(e);
		});
	}
}
