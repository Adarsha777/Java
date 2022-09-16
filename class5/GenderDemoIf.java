package com.basicJava.class5;

import java.util.Scanner;

public class GenderDemoIf {
	public static void main (String [] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter your Gender :");
		String gender = scanner.nextLine();
		
		boolean Result =checkGender(gender);
		System.out.println(Result);
		scanner.close();
		}
	
			private static boolean checkGender(String gender) {
				boolean genderResult=false;
	if(gender.equals("Male")) {
		genderResult=true;
		System.out.println("Male");
		return genderResult =true;
				}
	System.out.println("Female");
	return genderResult;
			}


}
