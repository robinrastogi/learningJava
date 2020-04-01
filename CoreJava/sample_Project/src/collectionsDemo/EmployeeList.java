package collectionsDemo;

	import java.util.List;
	
	class Employee{}
	
	public class EmployeeList {
		@SuppressWarnings("unchecked")
		public static void populateList(List list){
			list.add("System Engineer");
			list.add(new Integer(112233));
			list.add(new Employee());
		}
	}



