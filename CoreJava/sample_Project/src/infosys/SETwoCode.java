package infosys;

	import java.util.ArrayList;
	import java.util.List;


	public class SETwoCode {
		public static void main(String[] arg){
			List list = new ArrayList();
			try{
				EmployeeList.populateList(list);
				for(String s : (String [])list.toArray()){
					System.out.println(s);
				}
			}
			catch(Exception e){
				System.out.println("Encountered exception...\n\t"+e);
			}
			finally{
				System.out.println("Completed finally!\n\t");
			}
		}
	}
