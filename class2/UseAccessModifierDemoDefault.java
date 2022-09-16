package com.basicJava.class2;

public class UseAccessModifierDemoDefault {
	public static void main(String[] args) {
		
		AccessModifiersDemo accessModifierDemo=new AccessModifiersDemo(10, 20, 30);
		System.out.println("Value of Public Access Modifiers num2 is: "+accessModifierDemo.num2);
		System.out.println("Value of Default Access Modifiers num3 is: "+accessModifierDemo.num3);
		System.out.println("Value of private variable using public method: " +accessModifierDemo.getNum1());
		accessModifierDemo.findSum();
	}

}
