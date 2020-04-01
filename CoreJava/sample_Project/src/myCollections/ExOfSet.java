package myCollections;
import java.util.*;  

public class ExOfSet {
	public static void main(String args[]) {
//		HashSet<String> al=new HashSet<String>(); //unique elements, no order.
//		LinkedHashSet<String> al=new LinkedHashSet<String>(); //unique elements, insertion order.
		TreeSet<String> al=new TreeSet<String>(); //unique elements, ascending order.
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		Iterator<String> itr=al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}