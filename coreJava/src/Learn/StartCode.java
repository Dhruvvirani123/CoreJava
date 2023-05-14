package Learn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.TreeSet;
import java.util.Vector;

public class StartCode {
	public static void main(String[] args) {
		System.out.println("Welcome to code Java Collection Framwork");
		
		/*Creating Collection
		 1) Type Safe collection -> same type of elements(Object) are added to collection
		 Ex. Int atle int j bija na ly shakay
		 
		 2) Un/non Type Safe collection -> Different types of elements can be added to collection
		 Ex. int, char, float (Moj kro dost)
		 
		 */
		
		//Type safe collection create
		
		ArrayList<String> name = new ArrayList<String>(); //Only String Add
		name.add("Dhruv");
		name.add("DK");
		name.add("Tirth");
		name.add("Piyush");
		name.add("Dhruv"); //Duplicate Allowed
		System.out.println(name);
		System.out.println(name.get(0));
		System.out.println(name.get(3)); //Output Index Wise Data Get -> Dhruv Piyush
		
		System.out.println("Size : "+name.size()); //0 1 2 3 4 output -> 5
		
		 // index wise remove
		name.remove(3);
		System.out.println(name); // piyush Remove done
		
		//Size
		System.out.println("Size : "+name.size()); //0 1 2 3 = output -> 4
		
		//Check item is there or not
		//type ka equals method call kare che.... chacking karva mate...
		
		System.out.println(name.contains("Dhruv")); // Output true ya false this output-> true
		 
		//setting value
		name.set(2, "Romil");
		System.out.println(name); // ok done change value
		
		//Replace value
		name.add(2, "Tirth");
		System.out.println(name); // Index pe change value pela valu shift thy jashe tena index pr aa biju aavshe
		
		//Remove All the elements
		//name.clear();
		//System.out.println(name); // Output -> [] all elements remove now
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		//Un type safe collection create
		
		LinkedList list = new LinkedList();
		list.add("Dhruv");
		list.add(123);
		list.add('A');
		list.add(123);
		System.out.println(list);
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		
		Vector<String> vector = new Vector<>();
		vector.addAll(name);//ArrayList mathi Laaviya
		System.out.println("vector : "+name);
		
		
//////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("--------------------------HashSet----------------------------");
		
		HashSet<Double> nms = new HashSet<Double>();
		nms.add(12.3434344);
		nms.add(233.53535);
		nms.add(45.23232323);
		nms.add(23.6543); // Output order not same/mantin
		nms.add(12.3434344);// Duplicate not allow
		System.out.println(nms);
		
///////////////////////////////////////////////////////////////////////////////////////////////////////
		
		System.out.println("--------------------------Treeset----------------------------");
		
		TreeSet<Double> tset = new TreeSet<Double>();
		tset.add(12.758458);
		tset.add(54.4567890);
		tset.add(1.456789);
		tset.add(23.4567890);// Output order not same/mantin
		tset.add(54.4567890);// Duplicate not allow
		//output Shorted
		System.out.println(tset);
	}	
}