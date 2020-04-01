package myCollections;
import java.util.*;
public class ExampleOfSortingElementsOfList {
	public static void main(String args[]) {
		
		ArrayList<String> al=new ArrayList<String>();
		al.add("Viru");
		al.add("Saurav");
		al.add("Mukesh");
		al.add("Robin007");
		al.add("Robin100");
		al.add("Tahir");
		al.add("100");
		al.add("120");

		Collections.sort(al);
		Iterator<String> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
