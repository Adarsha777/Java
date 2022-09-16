package com.basicJava.class7;

import java.util.Scanner;

public class DoWhileLoop {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=scanner.nextInt();
		int i=1;
		
		do {
			
			System.out.println(i);
			i=i+2;
			
		}while(i<n);
		
		scanner.close();
	}

}
