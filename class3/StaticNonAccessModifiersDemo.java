package com.basicJava.class3;

public class StaticNonAccessModifiersDemo {
	public static int num1=10;
	
	public static void setNum1(){
		num1=50;
	}
	
	public static int getNum1() {
		return num1;
	}
	
	public static void main(String[] args) {
		System.out.println("Original Value: "+StaticNonAccessModifiersDemo.num1);
		StaticNonAccessModifiersDemo.setNum1();
		System.out.println("final result: "+StaticNonAccessModifiersDemo.getNum1());
	}
	

}
