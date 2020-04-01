package infosys;

import java.util.Map;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashMap;

public class CompleteMap {
	public static void main(String args[])	{
		Map<String, String> map=new LinkedHashMap<String, String>();

		//key,value pair stored in map
		map.put("one","Java");
		map.put("two","Oracle");
		map.put("three","JPA");

		//get() will return the value corresponding to key
		Object valueOne=map.get("one");
		System.out.println("Value for key one is :   "+valueOne);
//		Object valueTwo=map.get("two");
//		System.out.println("Value for key two is :   "+valueTwo);

		/*remove()- will return the object value corresponding
		to the key which we want to remove and also remove the
		key,pair from map*/
		System.out.println("Elements before removing  : "+map);
		System.out.println("Removed value corresponding to key three is : " +map.remove("three"));
		System.out.println("Elements after removing  : "+map);

		/*containsKey() will check that particular key is present in map or not and it returns a boolean result */
		if(map.containsKey("one")) {
			System.out.println("'one' is present in map as key");
		}
		else {
			System.out.println("'one' is not present in the map as key");
		}

		/*containsValue() will check that particular value
		is present in map or not and it returns a boolean result*/
		if(map.containsValue("Java")) {
			System.out.println("Java is present in map as value");
		}
		else {
			System.out.println("Java is not present in map as value");
		}

		//isEmpty() will check whether the map is empty or not
		if(map.isEmpty()) {
			System.out.println("Given map is an empty map");
		}
		else {
			System.out.println("Given map is not an empty map");
		}

		//size() will give the no of key,value pairs in the given map
		System.out.println("No of key,value pairs in map : "+map.size());

		/*Map does not extends Collection interface so we can not iterate
		over map. To iterate over map one has to convert map to a set using
		keySet() method,which will give the set of all the key values of map*/
//		Technically: keySet() => Returns a Set view of the keys contained in this map.

		Set<String> set=map.keySet();
		Iterator<String> it=set.iterator();
		System.out.println("All the keys of a map using keySet() method of map are :");
		while(it.hasNext()) {
			System.out.println("\t"+it.next());
		}
		
		
		// map.values allows an iterator to iterate over a map values. :)
		// technically: values() method => Returns a Collection view of the values contained in this map.
		// Here displaying values corresponsding to keys in the map before deleting any further values.
		Collection<String> valueCollection2=map.values();
		it=valueCollection2.iterator();
		System.out.println("All the  values using values()of map are before removing: ");
		while(it.hasNext()) {
			System.out.println("\t"+it.next());
		}
		//
		
		//Removes from the underlying map the last element returned by the iterator
//		technically: remove(Object key) => Removes the mapping for a key from this map if it is present (optional operation).
		it.remove();
		System.out.println("Map after calling iterator remove() method : "+map);
		
		// checking the deleted ...
		Object valueTwo=map.get("two");
		System.out.println("Value for key two is :   "+valueTwo);
		//
		
//		 Like the above values() will return collection of values
		Collection<String> valueCollection=map.values();
		it=valueCollection.iterator();
		System.out.println("All the  values using values()of map are :");
		while(it.hasNext()) {
			System.out.println("\t"+it.next());
		}

		//clear() method will empty out the map
		map.clear();
		//Check the size of the map
		int size=map.size();
		System.out.println("After clearing the map..");
		if(size==0) {
			System.out.println("\tmap is empty now");
		}
		else {
			System.out.println("\tmap is not empty");
		}
	}
}
