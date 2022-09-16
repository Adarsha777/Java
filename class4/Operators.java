package com.basicJava.class4;

public class Operators {
	public static void main(String[] args) {
		
		int a = 2;
		int x = 4;
		int result1 = 0;
		int result2 = 0;
		
		
		result1 = (a*x)*(a*x)+ 2*(a*x)+a*a;
		
		result2 = x*(a/x+x/a)+a*x*(x%a+a%x);
		
		System.out.println("the result is :"+result1);
		System.out.println("the result is :"+result2);
		
	}
	

}