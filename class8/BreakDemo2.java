package com.basicJava.class8;

import java.util.Scanner;

public class BreakDemo2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter name of animal");
		String sum="";
		for(int i=0;i<10;i++)
			
		{ 
			String nam=scanner.next();
			if(nam.length()<2)
			{
				break;
			}
			sum=sum+nam+",";

		}
		System.out.println(sum);
		
		
		scanner.close();
	}
}
