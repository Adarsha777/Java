package com.basicJava.class1;

public class LocalVariableDemo {
	LocalVariableDemo(){
		int num1=20;
		int num2=10;
		int sum=0;
		sum=num1 +num2;
		
		System.out.println("Sum of " +num1 + " and " +num2 + "= " +sum);
	}
	
	public void multiplication() {
		int num1=20;
		int num2=10;
		int mul=0;
		mul=num1*num2;
		System.out.println("multiplication of " +num1 + " and " +num2 + "= " +mul);
	}
	
	public static void main(String[]args) {
 		LocalVariableDemo localVariableDemo =new LocalVariableDemo();
		localVariableDemo.multiplication();
		
	}
}
