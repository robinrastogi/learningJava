package myCollections;
import java.util.*;

/**
 * 
 * @author 
 * Robin:
 * HashMap contains key value pair with no order, can contain one NULL key, and many NULL values, no uniques...
 * LinkedHashMap maintains insertion order, rest same as above...
 * TreeMap class => only unique elements, cannot have null key but can have multiple null values, maintains ascending order.
 * entrySet() => Method entrySet() returns the Set view containing all the keys and values.
 * Map.Entry  => to get the object of Entry sub-interface of Map Interface to use getKey() and getValue() methods.
 *
 */

public class ExampleOfHashMapClass {
	public static void main(String args[]) {
//		HashMap<Integer, String> hm=new HashMap<Integer, String>();
//		LinkedHashMap<Integer, String> hm=new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> hm=new TreeMap<Integer, String>();
		hm.put(100,"Amit");
//		hm.put(101,"Vijay");
//		hm.put(102,"Rahul");
		hm.put(102,"Rahul");
		hm.put(101,"Vijay");
//		hm.put(null,"Akshay");
//		hm.put(null,"Robin");
//		hm.put(103,null);
//		hm.put(104,null);
		hm.put(103,"Akash");
		hm.put(104,"Puneet");
		
		System.out.println("Map => " + hm);
		
		Set<?> set=hm.entrySet();
		
		System.out.println("Set => " + set);
		System.out.println("\n");
		
		Iterator<?> itr=set.iterator();

		while(itr.hasNext()) {
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+"   =>  "+m.getValue());
		}
	}
}
