package myCollections;
import java.util.*;

public class ExampleOfLinkedList {

	public ExampleOfLinkedList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	 public static void main(String args[]){
		 
		  LinkedList<String> ll=new LinkedList<String>();
		  ll.add("Ravi");
		  ll.add("Vijay");
		  ll.add("Ravi");
		  ll.add("Ajay");

		  Iterator<String> itr=ll.iterator();
		  while(itr.hasNext()){
		   System.out.println(itr.next());
		  }
		 }

}
