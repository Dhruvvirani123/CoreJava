package coreJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class mobile{
	private long price;
	private String company;
	private String ram;
	
	mobile(long price,String company, String ram)
	{
		this.price = price;
		this.company = company;
		this.ram = ram;
	}
	
	@Override
	public String toString() {
		return "price : "+price+"Company : "+company+"Ram"+ram;
	}
}
public class ListPractical {
	public static void main(String[] args) {
		mobile d1 = new mobile(100000,"Apple","8-gb");
		mobile d2 = new mobile(200000,"MI","16-gb");
		mobile d3 = new mobile(300000,"Samsung","4-gb");
		mobile d4 = new mobile(400000,"OppO","6-gb");
		mobile d5 = new mobile(500000,"Vivo","8-gb");
		
		List<mobile> list = new ArrayList<mobile>();
		list.add(d1);
		list.add(d2);
		list.add(d3);
		list.add(d4);
		list.add(d5);
		System.out.println(list);
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
