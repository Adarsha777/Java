package com.basicJava.class6;

import java.util.Scanner;

public class NestedIfStatementDemo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Username: ");
		String name=scanner.nextLine();
		System.out.println("UserPassword: ");
		String password=scanner.nextLine();
		
		if(name!=null && password!=null)
			{if(name.equals(password))
				{
					System.out.println("predencial is correct");
				}
			else
				{
				System.out.println("predencial is incorrect");
				}
			}
		scanner.close();
	}
}
