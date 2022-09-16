package com.basicJava.class2;

public class wideningDemo {
	public static void main(String[] args) {
		int num1=2;
		double num2=num1;
		System.out.println("Oringinal Num1: "+num1);
		System.out.println("After type casting: "+num2);
		
		float num3= 1.2f;
		double num4=num3;
		System.out.println("Oringinal Num3: "+num3);
		System.out.println("After type casting: "+num4);
		
		long num5=123l;
		double num6=num5;
		System.out.println("Oringinal Num3: "+num5);
		System.out.println("After type casting: "+num6);
		
	}

}
