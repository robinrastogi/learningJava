package com.mmm;

public class This_example {
	int value;
	void method_m(This_example obj) {
		System.out.println("Hi");
		obj.value=2;
		System.out.println("value of 'value' is = " + value);
		}
		void method_p() {
		method_m(this);
		}

	public This_example() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		This_example this_obj = new This_example();
		this_obj.method_p();
	}

}
