package ExOfComparatorInterface;
import java.util.*;

/**
 * 
 * @author Robin
 * This class defines comparison logic based on the age. 
 * 
 * If age of first object is greater than the second, we are returning positive value, 
 * it can be any one such as 1, 2 , 10 etc.
 * 
 * If age of first object is less than the second object, we are returning negative value, 
 * it can be any negative value and 
 * 
 * if age of both objects are equal, we are returning 0.
 *
 */

public class AgeComparator implements Comparator<Object> {
	public int compare(Object o1,Object o2) {
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		
		if(s1.age==s2.age)
			return 0;
		else if(s1.age>s2.age)
			return 1;
		else
			return -1;
	}
}