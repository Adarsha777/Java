package com.basicJava.class7;

import java.util.Scanner;

public class MultiplicationTableDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scanner.nextInt();
		int i=1;
		do {
			
			int res=n*i;
			
			System.out.println(res);
			i++;
		}while(i<n);
	
		
		scanner.close();
	}
}
