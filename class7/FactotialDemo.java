package com.basicJava.class7;

import java.util.Scanner;

public class FactotialDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scanner.nextInt();
		
		int i=n;
		int fact=1;
		while(i>=1) {
			
			fact=fact*i;
			
			System.out.println(fact);
			i--;
		}
		
		
		scanner.close();
		
	}
}
