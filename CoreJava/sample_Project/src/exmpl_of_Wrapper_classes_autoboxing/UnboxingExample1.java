package exmpl_of_Wrapper_classes_autoboxing;

class UnboxingExample1{
	public static void main(String args[]){
		Integer i=new Integer(50);
		System.out.println(i);
		if(i<100){            //unboxing internally
			System.out.println(i);
		}
	}
}