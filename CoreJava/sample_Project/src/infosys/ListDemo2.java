package infosys;

import java.util.*;
public class ListDemo2 {
	public static void main(String args[]) {
//		List<String> list = new ArrayList<String>();
		List<String> alist = new ArrayList<String>();
		alist.add("Robin");
		alist.add("Mark");
		alist.add("Sera");
		alist.add("Alan");
		
		System.out.println("Elements using ArrayList using listIterator:");
    		for (ListIterator<String> it = alist.listIterator(); it.hasNext(); )
        		System.out.println(it.next());
		
//		System.out.println("Elements using ArrayList using listIterator in reverse order:");
//		for (ListIterator<String> listIterator = list.listIterator(); listIterator.hasPrevious(); )
//    		System.out.println(listIterator.previous());
    		
/*    	System.out.println("Elements using ArrayList using iterator:");
    		for (Iterator<String> it2 = list.iterator(); it2.hasNext(); )
        		System.out.println(it2.next());*/

		//** displaying elements using while loop **//
//    	ListIterator<String> it3 = list.listIterator(); //Get an object of ListIterator using listIterator() method
//    	while(it3.hasNext()) {
//    		System.out.println(it3.next());
//    	}
    		
    	//** displaying elements using while loop & showing hasPrevious() **//
		ListIterator<String> listIterator = alist.listIterator();
//        ListIterator<String> it3 = list.listIterator();
        while(listIterator.hasPrevious())
        	System.out.println(listIterator.previous());
		
		
	    System.out.println("reverse direction using ListIterator");
	    while(listIterator.hasPrevious())
	      System.out.println(listIterator.previous());

    	
//		System.out.println("Element at index 1: " + list.get(1));
//		LinkedList<String> stack = new LinkedList<String>();
//		stack.addFirst("Mark");
//		stack.addFirst("Sera");
//		stack.addFirst("Alan");
//		stack.addFirst("James");
//		System.out.println("Elements using LinkedList(A Stack) :");
//		System.out.println(stack);
//		stack.removeLast();
//		System.out.println("Elements after removing last :");
//		System.out.println(stack);
	}
}
