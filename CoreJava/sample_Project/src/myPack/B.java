package myPack;
import pack.*;

public class B {

	public B() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj = new A();//compiler error as class A is defined with default access modifier 
		obj.message();//compiler error as method message is defined with default access modifier
	}

}
