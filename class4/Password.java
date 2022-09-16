package com.basicJava.class4;

import java.util.Scanner;

public class Password {
	
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);

	
		System.out.print("Enter user name : ");
		String userName=scanner.nextLine();
		
		System.out.print("Enter user password : ");
		String userPassword=scanner.nextLine();
	
		if(userName.equals("Admin") && userPassword.equals("Admin")) {
			System.out.println("user verified");
		}
		else {
			System.out.println("user not verified");
		}
		
		scanner.close();
	
	}
}