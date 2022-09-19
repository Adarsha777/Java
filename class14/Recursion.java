package com.basicJava.class14;

public class Recursion {
	
	static int sum=0;
	public void findSum (int n) {
		if(n>0) {
			sum=sum+n;
			n=n-1;
			findSum(n);
		}
	}
	
	public static void main(String[] args) {
		Recursion demo= new Recursion();
		demo.findSum(100);
		
		System.out.println("Sum: "+sum);
	}

}
