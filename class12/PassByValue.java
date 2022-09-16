package com.basicJava.class12;

public class PassByValue {
	 public static void change(int x)
	    {
	        x = 10;
	    }
	 
	public static void main(String[] args)
    {
        int x = 5;
        change(x);
        System.out.println(x);
    }
}
