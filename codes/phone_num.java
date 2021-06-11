/**
Write a Java program that prompts for and accepts a 
telephone number of the form xxxxx-xxxx where each x is 
a digit (e.g. 02-123-9999), and prints it out in the 
following form: xxxxxxxxx (e.g. 0-2123-9999). 
**/


import java.util.Scanner;
public class phone_num{
 public static void main(String[] args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter phone number: ");
 String phone = sc.nextLine();

 String n_phone = phone.replace("-", "");
 String ans = n_phone.substring(0,1) + "-" + n_phone.substring(1,5) + "-" +
n_phone.substring(5,9);
 System.out.println(ans);
 }
} 