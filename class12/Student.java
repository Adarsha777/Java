package com.basicJava.class12;

public class Student {
	private String firstName= "Ram";
	private String lastName="Panday";
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	public static void main(String[] args) {
		Student student = new Student();
		System.out.println(student);
	}

}
