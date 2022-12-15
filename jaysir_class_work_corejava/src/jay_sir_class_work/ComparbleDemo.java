package jay_sir_class_work;

import java.text.CollationElementIterator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("unused")
class TV implements Comparable<TV>{
	int price;
	String com;
	public int getprice() {
		return price;
	}
	public String getcom() {
		return com;
	}
	public TV(int price,String com) {
		this.com = com;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Company : "+com+", TV Price :"+price;
	}
	public int compareTo(TV o) {
		if (this.getprice()>o.getprice()) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
//	public int comString(TV d) {
//		if(this.getcom()>d.getcom()) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
//	}
	
public class ComparbleDemo {
	public static void main(String[] args) {
		TV t1 = new TV (10000,"Samsung");
		TV t2 = new TV (220000,"LG");
		TV t3 = new TV (110000,"Apple");
		TV t4 = new TV (120000,"Sony");

		List<TV> list = new ArrayList<>();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.add(t4);

		Collections.sort(list);
		for(TV m:list) {
			System.out.println(m);
		}
	}
}}
