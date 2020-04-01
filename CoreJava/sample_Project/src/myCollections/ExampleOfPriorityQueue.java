package myCollections;

import java.util.*;
/**
 * 
 * @author Robin
 * 
 * boolean contains(Object o)	=>This method returns true if this queue contains the specified element.
 * 
 * offer()						=> This method inserts the specified element into this priority queue,
 * 									doesn't throws exception if element can not be added.
 * 
 * boolean add(E e)				=>This method inserts the specified element into this priority queue, 
 * 									throws exception when element can not be added.
 * 
 * peek()						=> This method retrieves, but does not remove, the head of this queue, or 
 * 									returns null if this queue is empty.
 * 
 * poll()						=> This method retrieves and removes the head of this queue, 
 * 									or returns null if this queue is empty.
 * 
 * remove()						=> This method removes a single instance of the specified element from this queue, 
 * 									if it is present. throws exception if queue is empty.
 * 
 * int size()					=> This method returns the number of elements in this collection.
 * 
 * Object[] toArray()			=> This method returns an array containing all of the elements in this queue.
 * 
 *
 */

public class ExampleOfPriorityQueue {
	public static void main(String args[]) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("Amit");
		queue.add("Jai");
		queue.add("Vijay");
		queue.add("Karan");
//		queue.add("Jai");	Duplicates will be added...
		queue.add("Rahul");
		queue.offer("Robin");
		System.out.println(queue);
		System.out.println("head:"+queue.element()); 
		System.out.println("head:"+queue.peek());

		System.out.println("iterating the queue elements:");
		Iterator<String> itr=queue.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

		queue.remove();
		
		System.out.println("again iterating the queue elements:");
		Iterator<String> itrr=queue.iterator();
		while(itrr.hasNext()){
			System.out.println(itrr.next());
		}
		
		
		queue.poll(); 

		System.out.println("after removing two elements:");
		Iterator<String> itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}
}
