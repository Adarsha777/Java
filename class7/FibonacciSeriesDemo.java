package com.basicJava.class7;
import java.util.Scanner;
public class FibonacciSeriesDemo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any number");
		int n=scanner.nextInt();
		int a=0;
		int b=1;
		int sum=1;
		int  i;
		for(i=1;i<=n;i++)
		{
			System.out.println(a);
			sum=a+b;
			a=b;
			b=sum;
			
		}
		scanner.close();
	}
}
