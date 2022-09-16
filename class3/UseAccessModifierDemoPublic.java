package com.basicJava.class3;

import com.basicJava.class2.AccessModifiersDemo;

public class UseAccessModifierDemoPublic {
	public static void main(String[] args) {
		AccessModifiersDemo accessModifierDemo= new AccessModifiersDemo(10,20,30);
		System.out.println("Value public Access Modifiers num2 is: "+accessModifierDemo.num2 );
		
	}
}
