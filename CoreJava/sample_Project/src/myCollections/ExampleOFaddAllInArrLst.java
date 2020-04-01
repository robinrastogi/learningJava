package myCollections;
import java.util.*;

public class ExampleOFaddAllInArrLst {

	public ExampleOFaddAllInArrLst() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		  
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Ravi");
		al2.add("Sonoo");
		al2.add("Hanumat");
		al2.add("Sonoo");
		al2.add("Robin");
		
		al.addAll(al2);  // inserting al2 at the end of al with given order.
//		al.addAll(1,al2);  // inserting at specified position.
		Iterator<String> itr=al.iterator();
		System.out.println("new list====>");
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("");
		
//		ListIterator<String> itr2=al2.listIterator();
//		while(itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
		
//		al.removeAll(al2);   // it will remove the elements which which exists in al1 &al2 both.
//		System.out.println("iterating the elements after removing the elements of al2...");
//		Iterator<String> itr2=al.iterator();
//		while(itr2.hasNext()) {
//			System.out.println(itr2.next());
//		}
	}
}
