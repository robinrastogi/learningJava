package myCollections;
import java.util.*;

public class ExampleOfHashtable {
	public static void main(String args[]){
 
		Hashtable<Integer, String> hm=new Hashtable<Integer, String>();

		hm.put(100,"Amit");
		hm.put(102,"Ravi");
		hm.put(101,"Vijay");
		hm.put(103,"Rahul");

		Set<?> set=hm.entrySet();
		Iterator<?> itr=set.iterator();

		while(itr.hasNext()) {
			Map.Entry m=(Map.Entry)itr.next();
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}
}