package com.basicJava.class1;

public class InstanceVariableDemo {
	private int num1;
	private int num2;
	private int sum;
	private int mul;
	
	InstanceVariableDemo(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public void sum() {
		sum=num1+ num2;
		System.out.println("Sum of " +num1 + " and " +num2 + "= " +sum);
	}
	
	public void mul() {
		mul=num1* num2;
		System.out.println("multiplication of " +num1 + " and " +num2 + "= " +mul);
	}
	
	
	public static void main(String[] args) {
		InstanceVariableDemo instanceVariableDemo = new InstanceVariableDemo(10,20);
		instanceVariableDemo.sum();
		instanceVariableDemo.mul();
		
	}
}
