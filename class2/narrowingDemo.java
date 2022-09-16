package com.basicJava.class2;

public class narrowingDemo {
	public static void main(String[] args) {
		double num1=2.35;
		int num2= (int)num1;
		System.out.println("Oringinal Num3: "+num1);
		System.out.println("After type casting: "+num2);
		
		double num3=1.23;
		float num4=(float)num3;
		System.out.println("Oringinal Num3: "+num3);
		System.out.println("After type casting: "+num4);
		
		double num5=1.23;
		byte num6=(byte)num5;
		System.out.println("Oringinal Num3: "+num5);
		System.out.println("After type casting: "+num6);
		
		float num7=1.23f;
		long num8=(long)num7;
		System.out.println("Oringinal Num3: "+num7); 
		System.out.println("After type casting: "+num8);
		
		
	}

}
