package com.basicJava.class2;

public class AccessModifiersDemo {
	private int num1;
	public int num2;
	int num3;
	
	public AccessModifiersDemo(int num1, int num2, int num3)
	{
		this.num1=num1;
		this.num2=num2;
		this.num3=num3;
	}
	
	public int getNum1() {
		return num1;
	}
	
	void findSum() {
		int sum=0;
		sum=num1+num2+num3;
		System.out.println("Sum of "+num1+" , "+num2+" , "+num3+" = "+sum);
	}
	
}
