package exmpl_of_Wrapper_classes_autoboxing;

interface test{
	public void main(String args[]);
	boolean setFlag(Boolean []test[]);
	
}
public class Boxing_pega {
	
	public int calculator(int n) {
		int i=5;
		int result = i+n;
		return result;
	}
	
	public static void main(String args[]) {
		
		try {
//			Boxing_pega cal_obj = new Boxing_pega();
//			int res = cal_obj.calculator(new Integer(10));
//			System.out.println(res);
//			System.exit(0);
			System.out.println("inside try");
//			System.exit(0);
			int i;
			for (i=0;i<3;i++) {
				switch (i) {
//				default: System.out.println("D");
				case 0: System.out.println("0");
				case 1: System.out.println("1");
//					break;
				default: System.out.println("D");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally{
			System.out.println("inside finally");
		}
	}

}
