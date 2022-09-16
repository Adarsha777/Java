package com.basicJava.class6;

import java.util.Scanner;

public class CalculatePercentageDemo {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter marks in Maths");
		float m=scanner.nextFloat();
		System.out.println("Enter marks in English");
		float e=scanner.nextFloat();
		System.out.println("Enter marks in Java");
		float j=scanner.nextFloat();
		System.out.println("Enter marks in Physics");
		float p=scanner.nextFloat();
		System.out.println("Enter marks in Chemistry");
		float c=scanner.nextFloat();
		
		float total=m+e+j+p+c;
		
		float num=(total/500) *100;
		
		if(num>=80)
		{
			System.out.println("A");
		}
		
		else if(num>=60 && num<80)
		{
			System.out.println("B");
		}
		
		else if(num>=50 && num<60)
		{
			System.out.println("C");
		}
		else if (num>=40 && num<35)
		{
			System.out.println("D");
		}
		else
		{
			System.out.println("F");
		}
		scanner.close();
	}
}
