/**
Write a java program with the following statements: a. Statement that converts 1E6 to a Double
object. b. Statement that converts 1_000_000 to an Integer object. c. Statement that converts true
to a Boolean object. d. Statement that converts 'A' to a Character object. 
**/

import java.util.*;
public class object_conv{
 public static void main(String args[]){
  
  //sample
 double d = 1E6;
 int i = 1_000_000;
 boolean t = true;
 char c = 'A';

 Double doubleobj = d;
 Integer intobj = i;
 Boolean boolobj = t;
 Character charobj = c;

 System.out.println("Printing Objects\n\n");

 System.out.println("Double object: "+doubleobj);
 System.out.println("Integer object: "+intobj);
 System.out.println("Boolean object: "+boolobj);
 System.out.println("Character object: "+charobj);
 double doublevalue=doubleobj;
 int intvalue=intobj;
 boolean boolvalue=boolobj;
 char charvalue=charobj;
 
 System.out.println("\n\nPrinting Primitive Values\n\n");

 System.out.println("double value: "+doublevalue);
 System.out.println("integer value: "+intvalue);
 System.out.println("boolean value: "+boolvalue);
 System.out.println("char value: "+charvalue);
 }
}
