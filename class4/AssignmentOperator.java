package com.basicJava.class4;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num1=scanner.nextInt();
		
		
		System.out.print("Enter a number : ");
		int num2=scanner.nextInt();
		System.out.println();
		
		num1+=num2;
		System.out.println("Addition is "+num1);
		
		
		num1-=num2;
		System.out.println("substraction is "+num1);
		
		
		num1*=num2;
		System.out.println("multiplication is "+num1);
		
		
		num1/=num2;
		System.out.println("division is "+num1);
		
		
		scanner.close();

		

	}
}