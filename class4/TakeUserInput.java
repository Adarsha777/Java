package com.basicJava.class4;

import java.util.Scanner;

public class TakeUserInput {
     public static void main(String[] args) {
		
    	 
    	 Scanner scanner = new Scanner(System.in);
    	 System.out.println("enter a number");
    	 int num1 = scanner.nextInt();
    	 System.out.println("entered number is : "+num1);
    	 
    	 
    	 System.out.println("enter decimal number");
    	double num2 =  scanner.nextDouble();
    	System.out.println("entered decimal number is :"+num2);
    	
    	
    	System.out.println("enter a boolen number");
    	boolean num3 = scanner.nextBoolean();
    	System.out.println("entered boolean value is :"+num3);
    	
    	scanner.nextLine();
    	
    	System.out.println("enter a string :");
    	String data1 = scanner.nextLine();
    	System.out.println("entered string value is :"+data1);
    	
    	scanner.close();
	}
	
}