package collectionsDemo;

import java.util.*;
public class ListDemo{
	public static void main(String args[]){
		List<String> list = new ArrayList<String>();
		list.add("Mark");
		list.add("Sera");
		list.add("Alan");
		System.out.println(list);
		System.out.println("Elements using ArrayList :");
    		for (ListIterator<String> it = list.listIterator(); it.hasNext(); )
        		System.out.println("element => " + it.next());

//    		Array starts with index '0'
		System.out.println("Element at index 0: " + list.get(0));
		LinkedList<String> stack = new LinkedList<String>();
		stack.addFirst("Mark");
		stack.addFirst("Sera");
		stack.addFirst("Alan");
		stack.addFirst("James");
		stack.add("Robin");
		System.out.println("Elements using LinkedList(A Stack) :");
		System.out.println(stack);
		stack.removeLast();
		System.out.println("Elements after removing last :");
		System.out.println(stack);
	}
}