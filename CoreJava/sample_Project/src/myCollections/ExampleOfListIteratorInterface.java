package myCollections;
import java.util.*;

public class ExampleOfListIteratorInterface {

	public ExampleOfListIteratorInterface() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("Amit");
		al.add("Vijay");
		al.add("Robin");
		al.add("Kumar");
		al.add(1,"Sachin"); // adding element 'after' mentioned index position

		System.out.println("element at 2nd position: "+al.get(1));
		System.out.println("element at 1st position: "+al.get(0));
		System.out.println("\n");
		// with ref to '0' as starting position
		
//		----------------------------------------------------------------
		ListIterator<String> itr1=al.listIterator();
		
		System.out.println("traversing elements in forward direction from first node...");
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		System.out.println("\n");

//		----------------------------------------------------------------
		ListIterator<String> itr2=al.listIterator(2); //excluding index value from 
		
		System.out.println("traversing elements in forward direction from 2nd position...");
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("\n");
		
//		----------------------------------------------------------------	
		ListIterator<String> itr3=al.listIterator(2);

		System.out.println("traversing elements in backward direction from 2nd position (skipping second position)...");
		while(itr3.hasPrevious()) {
			System.out.println(itr3.previous());
		}
		System.out.println("\n");
//		----------------------------------------------------------------
		
	}
}