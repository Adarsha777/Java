package com.basicJava.class1;

public class StaticVariableDemo {
	
	public static String userProfile(String name,String address,int age){
		
		String userProfile="Name: "+name+"\nAddress: "+address +"\nAge: "+age;
		return userProfile;
	}
			
	
	public static void main(String[] args) {
		
		String details= StaticVariableDemo.userProfile("Ram","KTM", 20);
		System.out.println(details);
		
	}

}
