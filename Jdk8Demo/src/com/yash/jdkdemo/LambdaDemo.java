package com.yash.jdkdemo;
interface Demo
{
	public int showMsg(int num1, int num2);
}

public class LambdaDemo 
{

	public static void main(String[] args) throws Exception
	{
Demo d =( int num1,int num2)->{
	return num1+num2;

};

System.out.println("Addition :" + d.showMsg(10, 10));

Demo d1 =(num1,num2)->{
	return num1-num2;
};
System.out.println("Substraction :" +d1.showMsg(10, 10));


Demo d2 =(num1,num2)->{
	return num1*num2;
};
System.out.println("Multiplication :" + d2.showMsg(10, 10));


Demo d3 =(num1,num2)->{
	return num1/num2;
	};
System.out.println("Division :" + d3.showMsg(10, 0)); 
	}
	

}
