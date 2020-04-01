package myCollections;
import java.util.*;
import java.util.Map.Entry;

public class ExampleOfTreeMapClass {
	public static void main(String args[]){
		
		TreeMap<Integer, String> hm=new TreeMap<Integer, String>();

		hm.put(100,"Amit");
		hm.put(102,"Ravi");
		hm.put(103,"Rahul");
		hm.put(101,"Vijay");
//		hm.put(103,"Rahul"); //maintains ascending order of keys
//		hm.put(null,"Robin"); //cannot have null key
		hm.put(101,"Robin"); //contains unique values, if key is repeated it overwrites the earlier.
		hm.put(104,"akshay");
		hm.put(105,null); //can contain null values.
		hm.put(106,""); // can contain any number of null values.

		Set<?> set=hm.entrySet();
		Iterator<?> itr=set.iterator();
		
		while(itr.hasNext()) {
			Map.Entry<Integer, String> m=(Entry<Integer, String>)itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}