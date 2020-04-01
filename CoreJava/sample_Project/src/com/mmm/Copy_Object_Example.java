package com.mmm;

public class Copy_Object_Example {
	int id;
	String name;

	public Copy_Object_Example(int i, String n) {
		// TODO Auto-generated constructor stub
		id = i;
		name = n;
	}
	
	Copy_Object_Example(Copy_Object_Example coe){
		id = coe.id;
		name = coe.name;
	}
	
	void display(){
		System.out.println(id+" => "+name);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Copy_Object_Example coe1 = new Copy_Object_Example(100, "Robin");
		Copy_Object_Example coe2 = new Copy_Object_Example(coe1);
		coe1.display();
		coe2.display();

	}

}
