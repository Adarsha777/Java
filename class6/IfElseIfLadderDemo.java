package com.basicJava.class6;

import java.util.Scanner;

public class IfElseIfLadderDemo {
	public static void main(String[] args) {
		Scanner scanner= new Scanner (System.in);
		System.out.println("Enter ypur percentage");
		int num=scanner.nextInt();
		
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
		
		else if(num>=35 && num<50)
		{
			System.out.println("D");
		}
		
		else
		{
			System.out.println("f");
		}
		scanner.close();
		
		
	}
}
