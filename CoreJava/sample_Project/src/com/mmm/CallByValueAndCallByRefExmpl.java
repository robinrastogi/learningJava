package com.mmm;

public class CallByValueAndCallByRefExmpl {

	public CallByValueAndCallByRefExmpl() {
		// TODO Auto-generated constructor stub
	}
	int data=50;
	void change(int data){
		data=data+100;
//		this.data=data+100;
		System.out.println("value of data variable in change method: "+data);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CallByValueAndCallByRefExmpl obj=new CallByValueAndCallByRefExmpl();
		System.out.println("before change "+obj.data);
		obj.change(500);
		System.out.println("after change "+obj.data);
	}

}
