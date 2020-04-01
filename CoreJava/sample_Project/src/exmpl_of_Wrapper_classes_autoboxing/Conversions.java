package exmpl_of_Wrapper_classes_autoboxing;

public class Conversions
{
  public static void main(String args[])
  {                                     // converting string to byte
    String str2 = "10"; 		// 1st way
    byte b1 = Byte.parseByte(str2);
    System.out.println(b1*b1);          // prints 100
					// 2nd way
    Byte by1 = new Byte(str2);
    byte b2 = by1.byteValue();                                         
    System.out.println(b2*b2);          // prints 100           
 
                                        // converting string to short
    short s1 = Short.parseShort(str2);  // 1st way
    System.out.println(s1*s1);          // prints 100
 
    Short sh1 = new Short(str2);	// 2nd way
    short s2 = sh1.shortValue();                                         
    System.out.println(s2*s2);          // prints 100           
 
                                        // converting string to int
 
    int i1 = Integer.parseInt(str2);	// 1st way
    System.out.println(i1*i1);          // prints 100
 
    Integer in1 = new Integer(str2);	// 2nd way
    int i2 = in1.intValue();                                         
    System.out.println(i2*i2);          // prints 100           
 
                                        // converting string to long
 
    long l1 = Long.parseLong(str2);	// 1st way
    System.out.println(l1*l1);          // prints 100
 
    Long lo1 = new Long(str2);		// 2nd way
    long l2 = lo1.longValue();                                         
    System.out.println(l2*l2);          // prints 100           
 
                                        // converting string to float
 
    String str3 = "10.5f";       	// 1st way
          // or it can be String str3 = "10.5";  
    float f1 = Float.parseFloat(str3);
    System.out.println(f1*f1);          // prints 110.25
 
    Float fl1 = new Float(str3);        // 2nd way
    float f2 = fl1.floatValue();
    System.out.println(f2*f2);          // prints 110.25
 
                                        // converting string to double
 
    String str4 = "10.5";   		// 1st way
    double d1 = Double.parseDouble(str4);
    System.out.println(d1*d1);          // prints 110.25
 
    Double do1 = new Double(str4);	// 2nd way
    double d2 = do1.doubleValue();
    System.out.println(d2*d2);          // prints 110.25
 
                       // converting string to character
 
    String str1 = "A";
    char ch1 = str1.charAt(0);
    System.out.println(ch1);            // prints A
 
                       // converting string to boolean
 
    String str5 = "true";               // 1st way
    boolean b3 = Boolean.parseBoolean(str5);
    System.out.println(b3);
                                        // 2nd way
    Boolean bo1 = new Boolean(str5);
    boolean b4 = bo1.booleanValue();
    System.out.println(b4);                          
  }
}