//Program of changing the common property of all objects(static field).

package com.mmm;

public class StaticMethodExample{
   int rollno;
   String name;
   static String college = "ITS";
   
   static void change(){
   college = "BBDIT";
   }

   StaticMethodExample(int r, String n){
   rollno = r;
   name = n;
   }

   void display (){ 
	   System.out.println(rollno+" "+name+" "+college);
	   }

  public static void main(String args[]){
	  StaticMethodExample.change();

  StaticMethodExample s1 = new StaticMethodExample (111,"Karan");
  StaticMethodExample s2 = new StaticMethodExample (222,"Aryan");
  StaticMethodExample s3 = new StaticMethodExample (333,"Sonoo");

  s1.display();
  s2.display();
  s3.display();
  }
}
