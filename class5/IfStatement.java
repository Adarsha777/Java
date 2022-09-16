package com.basicJava.class5;
import java.util.Scanner;


public class IfStatement {
public static void main (String [] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number :");
		int num1=scanner.nextInt();
		
		System.out.println("Enter Second number :");
		int num2=scanner.nextInt();
		
		if(num1>num2) {
			System.out.println(" First number is greater ");
			scanner.close();
		}
	}

}
