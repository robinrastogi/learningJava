package myCollections;
import java.util.*;

public class ExOfSortingElementsOfListContainsWrapperClassObjects {
	public static void main(String args[]) {

//		Way1: with generics
		ArrayList<Integer> al=new ArrayList<Integer>(); // < > determines the data type
//		al.add("Robin"); //error !!!	
//		al.add(201);
		al.add(Integer.valueOf(201));
		al.add(Integer.valueOf(101));
		al.add(301);  //internally will be converted into objects as Integer.valueOf(230)
		
//		Way2: without generics
//		ArrayList al=new ArrayList();   
//		al.add(Integer.valueOf(201));   
//		al.add(Integer.valueOf(101));   
//		al.add(301);//internally will be converted into objects as Integer.valueOf(230)
		
//		Way3: without generics
//		ArrayList al=new ArrayList();
//		al.add(201);   
//		al.add(101);
//		al.add("Robin");  //java.lang.ClassCastException: java.lang.Integer cannot be cast to java.lang.String
//		al.add(301);
//		
//		Collections.sort(al); // java.lang.ClassCastException: Exception thrown.

		Collections.sort(al);
		
		Iterator<Integer> itr=al.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}