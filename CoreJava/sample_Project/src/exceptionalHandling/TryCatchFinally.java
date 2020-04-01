package exceptionalHandling;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		System.out.println("returned value is: " + testing());

	}
	
	public static int testing() {
		
		int i = 1000;
		int result = 0;
		
		try {

			//System.out.println("inside try and value of i is: " + i);
			//result = i/0;
			//result = 10;
			
			//return 10;
			
			//System.out.println("inside try after return and value of i is: " + i);
			
		} catch(IndexOutOfBoundsException e) {
			
			//System.out.println("inside catch before return, exception is: " + e);
			
			//return 20;
			
			//System.out.println("inside catch after return, exception is: " + e);
			
		} finally {
			
			System.out.println("Inside finally before return");
			
			return 30;
			
			//System.out.println("Inside finally after return");
		}
		
		//return result;
	}

}
