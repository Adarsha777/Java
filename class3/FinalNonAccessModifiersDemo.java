package com.basicJava.class3;

final public class FinalNonAccessModifiersDemo {
	
	private int num1;
	private String name;
	private boolean gender;
	
	public void setVariable() {
		num1=1;
		name="Adarsha";
		gender= true;
	}
	public void showVariable() {
		System.out.println("Num1 : "+num1);
		System.out.println("Name : "+name);
		System.out.println("Gender : "+gender);
	}

}
