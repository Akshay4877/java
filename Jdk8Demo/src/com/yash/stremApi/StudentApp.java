package com.yash.stremApi;
import java.util.ArrayList;
import java.time.LocalDate;
import java.time.Month;

import java.util.stream.Collectors;
public class StudentApp 
{

	public static void main(String[] args) 
	{
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student(40,"Akshay","A",75,LocalDate.of(1998,Month.APRIL, 19)));
		al.add(new Student(43,"shailesh","B",70,LocalDate.of(1998,Month.JULY, 14)));
		al.add(new Student(42,"Jay","C",71,LocalDate.of(1999,Month.MARCH, 13)));
		al.add(new Student(46,"Ram","D",90,LocalDate.of(1999,Month.AUGUST, 11)));
		System.out.println(al);
		
		al.forEach(  
	            (n)->System.out.println(n));
		         
		  ArrayList<Integer> studentscore=(ArrayList<Integer>) al.stream()
			        .filter(p->p.score<=80)
			       .limit(3)
			        .map(p->p.score)
			        .sorted()
			        .collect(Collectors.toList());
			        
			        
			        System.out.println(studentscore);
			    
			        long count=al.stream()
			                .count();
			        System.out.println(count);  
			        al.forEach(  
				            (n)->System.out.println(n));
	}

}
