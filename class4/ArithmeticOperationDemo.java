package com.basicJava.class4;

import java.util.Scanner;

public class ArithmeticOperationDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num1 =scanner.nextInt();
		System.out.println();
		System.out.println("Enter the number");
		int num2 =scanner.nextInt();
		System.out.println();
		
		int add = num1+num2;
		int sub = num1-num2;
		int mul =num1*num2;
		float div =(float) num1/(float)num2;
		System.out.println("add="+add);
		System.out.println("sub="+sub);
		System.out.println("mul="+mul);
		System.out.println("div="+div);
		scanner.close();
	}

}