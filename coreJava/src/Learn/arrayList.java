package Learn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class arrayList {
	public static void main(String[] args) {
		// ArrayList<int> a = new arrayList<int>(); //We can not create an array list of
		// the primitive types, such as int, float, char, etc
		ArrayList<Integer> b = new ArrayList<Integer>();// required to use the required wrapper class in such cases
		b.add(12);
		b.add(12);
		System.out.println(b);

		ArrayList a = new ArrayList();
		a.add("Dhruv");
		a.add('a');
		a.add(12);
		System.out.println(a);
		// Collections.sort(a); Run-time error

		ArrayList<Float> c = new ArrayList<Float>();
		c.add(12.2f);
		c.add(13.35f);
		System.out.println(c);

		Iterator itr = c.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		for (Float fl : c) { // for-each loop Iterator
			System.out.println(fl);
		}

		ArrayList<String> abc = new ArrayList<String>();
		abc.add("Dhruv");
		abc.add("DK");
		abc.add("Tirth");
		System.out.println(abc);
		System.out.println("Returning element : " + abc.get(2));// To get index number vise
		abc.set(0, "Romil");// Change in index vise

		for (String st : abc) {
			System.out.println(st);
		}

		// Sort ArrayList

		List<String> li = new ArrayList<String>();
		li.add("Dhruv");
		li.add("Romilbhai");
		li.add("Rushit");
		li.add("Bhargavbhai");
		Collections.sort(li); // Alphabet Sorted
		for (String s : li) {
			System.out.println(s);
		}
		System.out.println("Sorting String...");

		// Sort Integer

		ArrayList<Integer> in = new ArrayList<Integer>();
		in.add(12);
		in.add(10);
		in.add(90);
		in.add(5);

		Collections.sort(in); // Number vise sorted
		for (Integer s1 : in) {
			System.out.println(s1);
		}

		ArrayList<Float> flo = new ArrayList<Float>();
		flo.add(12.45f);
		flo.add(2.45f);
		flo.add(12.46f);
		flo.add(121.89f);
		flo.add(2.46f);

		Collections.sort(flo); // Ha bete Moj krdi.. Smile...
		for (Float f : flo) {
			System.out.println(f);
		}
	}
}