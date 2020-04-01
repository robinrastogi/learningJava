/**
 * 
 */
package com.mmm;

/**
 * @author robin
 *
 */
public class xyz {

	/**
	 * 
	 */
	public xyz() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	String message;
	public void Display(String a){
		message="Hi " + a + " " + "Hello !!";	
		System.out.println(message);
	}
	
	
	public static void main(String[] args) {
		String x = args[0];
		xyz disp_obj = new xyz();
		disp_obj.Display(x);
		System.out.println("Hello World");
		
	}

}
