package collectionsDemo;

	import java.util.ArrayList;
	import java.util.List;


	public class SEOneCode {
		public static void main(String[] arg) {
			List list = new ArrayList();
			EmployeeList.populateList(list);
			for(int index=0 ; index<list.size() ; index++)
				System.out.println(" "+ index + " : " + list.get(index) );
		}
	}


