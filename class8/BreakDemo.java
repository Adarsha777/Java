package com.basicJava.class8;

import java.util.Scanner;

public class BreakDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter nth term");
		int n=scanner.nextInt();
		int sum=0;
		
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter a number ");
			int num=scanner.nextInt();
			
			if(num<0)
			{
				break;
			}
			sum=sum+num;
			
		}
		System.out.println("sum is: "+sum);
		
		scanner.close();
	}
}
