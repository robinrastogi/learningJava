package collectionsDemo;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CompleteList{
	public static void main(String args[])	{
		/* First List */
		List<String> list=new ArrayList<String>();
		list.add("One"); // Line-1
		list.add("Two"); // Line-2
		list.add("Three"); // Line-3
		list.add("Four"); // Line-4
		list.add("Five"); // Line-5
		//Comment Line-1 and Line-2 and observe the output

		/*Check whether the list is empty or not if yes then print the message
			otherwise get a iterator to print elements in the given list*/
		if(list.isEmpty()){
			System.out.println("Given list is empty");
		}
		else {
			System.out.println("List is not empty list and elements are :");
			Iterator<String> iterator=list.iterator();
			while(iterator.hasNext()) {
				System.out.println("\t"+iterator.next()+"   ");
			}
		}

		//Method contains() will check whether the given element is present in the list or not
		if(list.contains("Two")) {
			System.out.println("Two is present in list");
		}
		else {
			System.out.println("two is not present in list");
		}
		/* Second List */
		List<String> newList=new ArrayList<String>();
		newList.add("One");
		newList.add("Two");
		//newList.add("Three");  Line-41
		//Uncomment this Line-41 and observe the output

		//Two lists are equal if they contain the same elements in the same order
		if(list.equals(newList)) {
			System.out.println("Both the list and newList are equal");
		}
		else{
			System.out.println("list and newList are not equal");
		}

		//Printing the hashCode values for the lists
		System.out.println("Hash code for list :"+list.hashCode());
		System.out.println("Hash code for newList :"+newList.hashCode());

		/*We see that hashCode value for both the lists are not same...
			Note: if two different lists are equal then there hashCode() value will be same*/

		//To get the size of the list

		System.out.println("Size of list is :"+list.size());

		//Remove "One" from list and then check the size

		list.remove("One");

		System.out.println("Size of list after removing one	element :"+list.size());
		
		System.out.println("Now the List as:");
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()) {
			System.out.println("\t"+iterator.next()+"   ");
		}

		//Clear the list means to empty the list

		/*list.clear();

		System.out.println("size of the list after clear is"+ list.size());*/

		//Convert list into array of objects
		Object[] newListArray=newList.toArray();
		//Print the second element of the array "Two"
		System.out.println("first element of the array "+newListArray[0]);
		System.out.println("Second element of the array "+newListArray[1]);
				
		Object[] ListArray=list.toArray();
		//Print the second element of the array "Two"
		System.out.println("Second element of the array "+ListArray[0]);
		System.out.println("third element of the array "+ListArray[1]);
		System.out.println("fourth element of the array "+ListArray[2]);
		System.out.println("? element of the array "+ListArray[3]);
//		System.out.println("Second element of the array "+ListArray[4]);
		
//		OR
		
		System.out.println("displaying through iterator method, the List is as:");
		Iterator<String> iterator_2=list.iterator();
		while(iterator_2.hasNext()) {
			System.out.println("\t"+iterator_2.next()+"   ");
		}
		
//		for (int i=0;i<list.size();i++) {
//			System.out.println("element "+(i+1)+" of the array is "+ListArray[i]);
//		}
	}
}



