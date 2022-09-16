package com.basicJava.class8;

import java.util.Scanner;

public class ContinueDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the no. of loop");
		int n=scanner.nextInt();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter numbers");
			int num=scanner.nextInt();
			
				if(num%2!=0)
				{continue;}
			sum=sum+num;	
		}
		System.out.println(sum);
		
		scanner.close();
	}
}
