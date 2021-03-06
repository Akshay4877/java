package com.yash.jdkdemo;
@FunctionalInterface
interface Employee 
{
		public void showId();
	    default void show()
	    {
	        System.out.println("I am in show");
	    }
	    
	    static void showName()
	    {
	        System.out.println("Static Method From Employee Interface");
	    }
	}
public class InterfaceDemo implements Employee 
{
    
	 public static void main(String[] args) 
	    {
	        InterfaceDemo i=new InterfaceDemo();
	        i.showId();
	        i.show();
	        Employee.showName();
	        i.showName();
	        
	    }

	        @Override
	        public void showId() 
	        {
	            System.out.println("My id is 12..");
	        }

	     

	        public void show()
	        {
	            System.out.println("I am in InterfaceDemo");
	        }
	        public void showName()
	        {
	            System.out.println("Static Method in InterfaceDemo");
	        }
	    }
