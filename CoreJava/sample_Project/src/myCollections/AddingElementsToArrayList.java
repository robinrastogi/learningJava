package myCollections;
import java.util.*;

public class AddingElementsToArrayList {

	public AddingElementsToArrayList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		//		ArrayList al=new ArrayList();
		//		al.add("Ravi");
		//		al.add("Vijay");
		//		al.add("Ravi");
		//		al.add("Ajay");
		//		Iterator itr=al.iterator();
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		Iterator<String> itr=al.iterator();
		// Returns an iterator over the elements in this collection.
		// Iterator => Interface
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
