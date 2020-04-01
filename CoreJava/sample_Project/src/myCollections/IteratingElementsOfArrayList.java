package myCollections;
import java.util.*;

public class IteratingElementsOfArrayList {

	public IteratingElementsOfArrayList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	 public static void main(String args[]){
		 
//		  ArrayList al=new ArrayList();
//		  al.add("Ravi");
//		  al.add("Vijay");
//		  al.add("Ravi");
//		  al.add("Ajay");
		  ArrayList<String> al=new ArrayList<String>();
		  al.add("Ravi");
		  al.add("Vijay");
		  al.add("Ravi");
		  al.add("Ajay");
		  al.add("100");
//		  al.add(100); //error !!!
		  
//		  Two ways to iterate the elements of collection
//		  way-1:
//		  Iterator<String> itr=al.iterator();
//		  while(itr.hasNext()) {
//			  System.out.println(itr.next());
//		  }
//		  way-2:
		  for(Object obj:al)
		    System.out.println(obj);
		 }
}
