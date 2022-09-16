package com.basicJava.class7;

import java.util.Scanner;

public class WhileLoopDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scanner.nextInt();
		int i=0;
		while(i<n) {
			System.out.println(i);
			i=i+2;
		}
		scanner.close();
	}
}
