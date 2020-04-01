package myCollections;
import java.util.*;

public class SelectUsrDefndClsObjctsInArrLst {

	public SelectUsrDefndClsObjctsInArrLst() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	 public static void main(String args[]) {
		 Student s1=new Student(101,"Sonoo",23);
		 Student s2=new Student(102,"Ravi",21);
		 Student s3=new Student(103,"Hanumat",25);
		 Student s4=new Student(104,"Robin",27);
		   
//		 ArrayList al=new ArrayList();
//		 al.add(s1);
//		 al.add(s2);
//		 al.add(s3);
//		 al.add(s4);
		 
		 ArrayList<Student> al=new ArrayList<Student>();
		 al.add(s1);
		 al.add(s2);
		 al.add(s3);
		 al.add(s4);
		 
		 Iterator<Student> itr=al.iterator();
		 
		 while(itr.hasNext()) {
			 Student st=(Student)itr.next();  // Important line in the program
		     System.out.println(st.rollno+" "+st.name+" "+st.age);
		 }
	}

}
