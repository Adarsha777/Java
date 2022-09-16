package com.basicJava.class11;

import java.util.Scanner;

public class FibonacciSeries {
public static void main(String[] args) {

	    int firstTerm = 0, secondTerm = 1;
	    
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
			System.out.println("Enter a number:");
			int n=scanner.nextInt();
			
			for (int i = 1; i <= n; ++i) {
			  System.out.print(firstTerm + ", ");

			  // compute the next term
			  int nextTerm = firstTerm + secondTerm;
			  firstTerm = secondTerm;
			  secondTerm = nextTerm;
			}
		}
	  }
