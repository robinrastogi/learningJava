package exmpl_of_Wrapper_classes_autoboxing;

public class ParsingDemo
{
  public static void main(String args[])
  {
    String price ="100";                 // declare some strings
    String rate = "5.8f";
    String tax ="50.2";
                                         // performing parsing operations on strings	
    int x = Integer.parseInt(price);
    float f1 = Float.parseFloat(rate);
    double y = Double.parseDouble(tax);
 
    System.out.println("\nPrinting data type values after parsing");
    System.out.println("int value: " + x);
    System.out.println("float value: " + f1);
    System.out.println("double value: " + y);
            // another style of converting strings into data types, very less used               
    Integer i1 = new Integer(price);
    Float f2 = new Float(rate);
    Double d1 = new Double(tax);
	    // extracting data types from wrapper objects
    int x1 = i1.intValue();
    float f3 = f2.floatValue();
    double d2= d1.doubleValue();
 
    System.out.println("\nPrinting data type values after conversion");
    System.out.println("int value: " + x1);
    System.out.println("float value: " + f3);
    System.out.println("double value: " + d2);
  }
}