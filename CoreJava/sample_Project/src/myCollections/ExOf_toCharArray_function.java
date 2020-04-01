package myCollections;

import java.io.*;
import java.util.Random;

public class ExOf_toCharArray_function{
   public static void main(String args[]){
      String Str = new String("Hello Java in 2014");
      int lengthOfStr = Str.length();
      System.out.print(lengthOfStr+"\n");

//      System.out.print("Return Value :" );
//      System.out.println(Str.toCharArray() );
//      Random randomGenerator = new Random();
      char[] chars = Str.toCharArray();
      
      for (int i=0; i < lengthOfStr; i++) {
    	  System.out.println(chars[i]);
      }
      
//      for (int i=0; i < lengthOfStr; i++) {
//    	  int n = randomGenerator.nextInt(lengthOfStr);
//    	  chars[i] = chars[n];
//    	  String newStr = new String(chars);
//          Str = newStr;
//      }
      
//      System.out.println(Str); 

   }
}