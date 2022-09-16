package com.basicJava.class5;

import java.util.Scanner;

public class TernaryOperatorDemo {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter a number");
		int num = scanner.nextInt();
		
		String result=( num%2==0)?"even":"odd";
		System.out.println("result: "+result);
	scanner.close();
	}

}
