package com.yash.datedemo;
/*
 * java7 DateTimeApi
 * @author akshay.patil
 * 
 */
import java.util.Date;
public class DateApi 
{
	public static void main(String args[])
	{
		System.out.println(System.currentTimeMillis());//return time in miliseconds
		System.out.println(System.currentTimeMillis()/1000/3600/24/365);//return year
		
		Date d = new Date();//Date class
		System.out.println(d);
		
		System.out.println(d.getTime());
		System.out.println(d.getDate());
		System.out.println(d.getSeconds());
		System.out.println(d.getYear());
		
		
	}
}
