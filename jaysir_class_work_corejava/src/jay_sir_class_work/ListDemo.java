package jay_sir_class_work;

import java.util.ArrayList;

import java.util.Iterator;
import java.util.List;

import javax.print.attribute.Size2DSyntax;

@SuppressWarnings("unused")
public class ListDemo {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		@SuppressWarnings("rawtypes")
		List list = new ArrayList<>();
		list.add(1);
		list.add('D');
		list.add("Dhruv");
		list.add(12.23);
		list.add(-12);
		list.add(1);
		list.add(12.1212);
		
		System.out.println(list);
		System.out.println("Size of List : "+list.size());
		
		System.out.println();
		list.remove(2);
		System.out.println(list);
		System.out.println("Size of List : "+list.size());
		
		System.out.println();
		@SuppressWarnings("rawtypes")
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
