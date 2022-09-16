package com.basicJava.class4;

public class LogicalOperatorDemo {
	
	
	public static void main(String[] args) {
		
		int num1=2;
		int num2 =3;
		
		int sum = 0;
		if ((num1>num2) || (num1!=0))
		{
		 sum=num1+num2;
		 
		 System.out.println("Sum is : "+sum);
		}else
		{
		 sum= num1-num2;	
		 System.out.println("Subtraction is : "+sum);
		}
		
		
		if ((num1>num2)&&(num1!=0))
		{
			 sum=num1+num2;
			 
			 System.out.println("Sum inside and operator : "+sum);
			 
		}
		else
		{
		 sum= num1-num2;	
		 System.out.println("Subtraction inside and operator ..else "+sum);
		}
		
	}

}