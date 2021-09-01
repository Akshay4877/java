package com.yash.jdkdemo;
import java.util.*;  
public class LambdaDemo2{  
    public static void main(String[] args) {  
          
        ArrayList<String> list=new ArrayList<String>();  
        list.add("Akshay");  
        list.add("Sahilesh");  
        list.add("Usha");  
        list.add("Harshada");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  