package com.basicJava.class3;

public abstract class AbstractDemo {
	
	public void sum(int num1, int num2 ) {
		
		int sum = num1 +num2;
		System.out.println("sum of "+num1+","+num2+"="+sum);
	}
	public abstract void mul(int num1, int num2);
	public abstract int sub(int num1, int num2);
	
	

}
