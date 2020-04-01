package exmpl_of_Wrapper_classes_autoboxing;

class Boxing2{
//	static void m(int i, int i2){
//		System.out.println("int int");
//	}
//	static void m(Integer... i){
//		System.out.println("Integer...");
//	}
	
//	static void m(Integer i){
//		System.out.println("Integer");
//	}
	static void m(Integer... i){
		System.out.println("Integer...");
	}  

  public static void main(String args[]){
//   short s1=30,s2=40;
//   m(s1,s2);
//	   int a=30;
	   Integer a = new Integer(30);
	   m(a); 
 }
}