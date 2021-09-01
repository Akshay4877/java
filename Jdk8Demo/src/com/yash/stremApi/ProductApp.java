package com.yash.stremApi;

//import java.nio.file.DirectoryStream.Filter;
/**
 * Using Jdk8 lambda expression
 * @author akshay.patil
 */
import java.util.ArrayList;
//import java.util.stream.Collector;
import java.util.stream.Collectors;
public class ProductApp 
{
	  public static void main(String[] args) {
	        ArrayList<Product>a=new ArrayList<>();
	        a.add(new Product(1,"Mobile",4000));
	        a.add(new Product(2,"TV",25000));
	        a.add(new Product(3,"Remote",1000));
	        System.out.println(a);
	        ArrayList<Integer> productPrice=(ArrayList<Integer>) a.stream()
	        .filter(p->p.price<=3000)
	        .limit(3)
	        .map(p->p.price)
	        .sorted()
	        .collect(Collectors.toList());
	        
	        
	        System.out.println(productPrice);
	    
	        long count=a.stream()
	                .count();
	        System.out.println(count);
	    }
}
