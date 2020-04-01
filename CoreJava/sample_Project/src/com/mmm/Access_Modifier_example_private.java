package com.mmm;

class Ab{
	private int data=40;
	private void message(){
		System.out.println("Hello bhaiya");
	}
//	int data=40;
//	void message(){
//		System.out.println("Hello bhaiya");
//	}
}

public class Access_Modifier_example_private {

	public Access_Modifier_example_private() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ab obj = new Ab();
		System.out.println(obj.data);
		obj.message();
	}

}
