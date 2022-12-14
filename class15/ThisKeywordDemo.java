package com.basicJava.class15;

public class ThisKeywordDemo {
	
	private int num1;
	private int num2;
	private int sum;
	
	public ThisKeywordDemo() {
		System.out.println("Defult constructor invoke");
	}
	
	public ThisKeywordDemo(int num1,int num2) {
		this();
		this.num1=num1;
		this.num2=num2;
		this.add();
	}
	
	public void showMethod(ThisKeywordDemo obj) {
		System.out.println("This keyword used to passed as an argument");
		int result=this.getSum();
		System.out.println("Sum of "+num1+ ","+num2 +"="+result);
	}
	
	public void add() {
		sum=num1+num2;
		showMethod(this);
	}
	
	public int getSum() {
		return this.sum;
	}
	
	
	public static void main(String[] args) {
		
		new ThisKeywordDemo(10,30);
	}

}
