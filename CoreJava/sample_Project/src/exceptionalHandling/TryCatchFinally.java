package exceptionalHandling;

/**
 * @author Robin
 * 1) If finally block returns a value then try and catch blocks may or may not return a value.
 * 2) If finally block does not return a value then both try and catch blocks must return a value.
 * 3) If try-catch-finally blocks are returning a value according to above rules, 
 * 		then you should not keep any statements after finally block. 
 * 		Because they become unreachable and in Java, Unreachable code gives compile time error.
 * 4) finally block overrides any return values from try and catch blocks.
 * 5) finally block will be always executed even though try and catch blocks are returning the control.
 * 
 */
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
