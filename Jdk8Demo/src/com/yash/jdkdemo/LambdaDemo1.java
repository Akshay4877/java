package com.yash.jdkdemo;

interface PrintData
{
	void sayMessage(String message);
}
public class LambdaDemo1 
{
	final static String Message = "String";

	public static void main(String[] args) 
	{
        PrintData d = message -> 
        	System.out.println(Message  +   message);
        	d.sayMessage(" message ");
        
	}

}
