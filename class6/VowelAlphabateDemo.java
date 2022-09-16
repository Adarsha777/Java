package com.basicJava.class6;

import java.util.Scanner;

public class VowelAlphabateDemo {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter a word");
		String name= scanner.nextLine();
		String nname=name.toLowerCase();
		char alpha=nname.charAt(0);
		if(alpha=='a'|| alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u')
		{
			System.out.println("Character is vowel");
		}
		else
		{
			System.out.println("Character is not vowel");
		}
		scanner.close();		
	}
}
