package com.yash.Abstact_Interface;
/**
 * Implementing Abstract class

 *
 */
public abstract class Employee 
{
   void getCompanyName()
   {
	   System.out.println("Yash technology");
   }
    
   Employee()
   {
	   System.out.println("Default Constructor");
   }
 
    final static String address = "Pune";
   
   abstract void getId();
   abstract void getSal();
   abstract void getDesg();
  
   
}
