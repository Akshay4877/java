package com.yash.datedemo;
/*
 * java8 date time 
 * @author akshay.patil
 * 
 */
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.TimeZone;

public class Date {

	public static void main(String[] args) 
	{
	 LocalDate d =  LocalDate.now();
	 System.out.println("date - " +d);
	 
	 LocalTime t = LocalTime.now();
	 System.out.println(t);
	 
	 LocalDateTime dt = LocalDateTime.now();
	 System.out.println(dt);
	 
	 DateTimeFormatter df =   DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 String myDate = dt.format(df);
	 
	 System.out.println(myDate);
	 System.out.println("Day of Week : " + d.getDayOfWeek());
	 System.out.println("Day of month : " + d.getDayOfMonth());
	 System.out.println("Day of year : " + d.getDayOfYear());
	 System.out.println("Month : " + d.getMonth());
	 System.out.println("year : " + d.getYear());
	 System.out.println("month in number : " + d.getMonthValue());
	 System.out.println("chronology " + d.getChronology());
	 LocalDate d1 = LocalDate.of(2021, 02, 20);
	 System.out.println(d1);
	 
	 Calendar c = Calendar.getInstance();
	//Calendar c = Calendar.getInstance(TimeZone.getTimeZone("INDIA"));
	 System.out.println(c.getCalendarType());
	 System.out.println(c.getTimeZone().getID());
	 System.out.println(c.getTime());
	 
	 Calendar c1 = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore"));
	 System.out.println(c1.getCalendarType());
	 System.out.println(c1.getTimeZone());
	 
	   
	}

}
