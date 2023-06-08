package Learn;

import java.util.ArrayList;

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

		ArrayList<Float> c = new ArrayList<Float>();
		c.add(12.2f);
		c.add(13.35f);
		System.out.println(c);

	}
}