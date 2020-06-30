package ExOfComparatorInterface;
import java.util.*;
import java.io.*;

/**
 * 
 * @author Robin
 * In this class, we are printing the objects values by sorting on the basis of name and age.
 *
 */

public class Simple {
	public static void main(String args[]) {
		
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(new Student(101,"Vijay",23));
		al.add(new Student(106,"Ajay",27));
		al.add(new Student(105,"Jai",21));
		
		System.out.println("Sorting by Name...");
		
		Collections.sort(al,new NameComparator());
		Iterator<Student> itr=al.iterator();
		while(itr.hasNext()) {
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" "+st.name+" "+st.age);
		}
	System.out.println("sorting by age...");
	
	Collections.sort(al,new AgeComparator());
	Iterator<Student> itr2=al.iterator();
	while(itr2.hasNext()) {
		Student st=(Student)itr2.next();
		System.out.println(st.rollno+" "+st.name+" "+st.age);
	}
}
}