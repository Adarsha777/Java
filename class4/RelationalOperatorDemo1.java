package com.basicJava.class4;

import java.util.Scanner;
      public class RelationalOperatorDemo1 {

	public static void main(String[] args) {
				
				Scanner scanner=new Scanner(System.in);
				System.out.print("Enter 1st number : ");
				int num1=scanner.nextInt();
				
				System.out.print("Enter 2nd number : ");
				int num2=scanner.nextInt();
				System.out.println();
			
				if(num1==num2) {
					System.out.println("Equal");
				}
				else {
					System.out.println("Not equal");
				}
				
				if(num1!=num2) {
					System.out.println("Not Equal");
				}
				else {
					System.out.println("Equal");
				}
				
				if(num1>num2) {
					System.out.println(num1+" is greater than "+num2);
				}
				else {
					System.out.println(num1+" is not greater than "+num2);
				}
				
				if(num1<num2) {
					System.out.println(num1+" is smaller than "+num2);
				}
				else {
					System.out.println(num1+" is not smaller than "+num2);
				}
				
				if(num1>=num2) {
					System.out.println(num1+" is greater or equal than "+num2);
				}
				else {
					System.out.println(num1+" is not greater or equal than "+num2);
				}
				
				if(num1<=num2) {
					System.out.println(num1+" is smaller or equal than "+num2);
				}
				else {
					System.out.println(num1+" is not smaller or equal than "+num2);
			
			}
				scanner.close();
			}
		}