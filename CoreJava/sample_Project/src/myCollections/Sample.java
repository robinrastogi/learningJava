package myCollections;

import java.util.ArrayList;
import java.util.ListIterator;

public class Sample {

	  public static void main(String[] args) {
	    //create an object of ArrayList
	    ArrayList<String> aList = new ArrayList<String>();

	    //Add elements to ArrayList object
	    aList.add("1");
	    aList.add("2");
	    aList.add("3");
	    aList.add("4");
	    aList.add("5");

	    //Get an object of ListIterator using listIterator() method
	    ListIterator<String> listIterator = aList.listIterator();

	    System.out.println(" forward direction using ListIterator");
	    while(listIterator.hasNext())
	      System.out.println(listIterator.next());
	    
//	    ListIterator() Interface provides methods for traversing both forward as well as backward direction
//	    using hasPrevious() method()
	    System.out.println("reverse direction using ListIterator");
	    while(listIterator.hasPrevious())
	      System.out.println(listIterator.previous());

	  }
	}