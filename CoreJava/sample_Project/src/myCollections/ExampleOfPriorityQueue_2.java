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

public class ExampleOfPriorityQueue_2 {
	public static void main(String args[]) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		queue.add("2");
//			System.out.println(queue);
		queue.add("4");
//		queue.offer("1");
//			System.out.println(queue);
		System.out.print(queue.peek()+" ");
//			System.out.println(queue);
		queue.offer("1");
//		queue.add("1");
//			System.out.println(queue);
		queue.add("3");
//			System.out.println(queue);
		queue.remove("1");
//			System.out.println(queue);
		System.out.print(queue.poll()+" ");
		
		if (queue.remove("2")) {
			System.out.print(queue.poll()+" ");
		}
//			System.out.println(queue);
		System.out.println(queue.poll()+" "+queue.peek());
//			System.out.println(queue);
	}
}