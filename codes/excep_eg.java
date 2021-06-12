/**
Identify the possible types of exceptions in the given code and write an appropriate java code that
employs multiple catch blocks to handle those identified exceptions.
**/

import java.util.*;
class excep_eg{
 public static void main(String args[]){
 try{
 int i = args.length;
 String myString[] = new String[i];
 if(myString[0].equals("java"));
 System.out.println("first word is java!");
 System.out.println(" number of arguments = " +i); 
 int x = 18/i;
 int y[] = {555, 999 };
 y[i] = x;
 }
 catch (ArrayIndexOutOfBoundsException exp){
 System.out.println(exp);
 }
 catch(ArithmeticException exp){
 System.out.println(exp);
 }
 catch(Exception exp){
 System.out.println(exp);
 }
 }
} 
