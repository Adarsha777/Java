package com.basicJava.class6;

import java.util.Scanner;

public class SquareRectangleDemo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any length");
		int a=scanner.nextInt();
		System.out.println("Enter any breath");
		int b=scanner.nextInt();
		
		
		if(a==b) {
			System.out.println("it is square");
		}
		else if(a !=b) {
			System.out.println("it is rectangle");
		}
		scanner.close();
	}

}
