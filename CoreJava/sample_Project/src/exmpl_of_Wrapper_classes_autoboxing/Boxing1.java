package exmpl_of_Wrapper_classes_autoboxing;

class Boxing1{  
  static void m(int i){System.out.println("int");}  
  static void m(Integer i){System.out.println("Integer");}  
  
  public static void main(String args[]){
//	  int s=30;
	  Integer s = new Integer(30);
//   short s=30;  
   m(s);  
 }   
}  