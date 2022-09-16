package com.basicJava.class2;

public class advanceCasting {
	public static void main(String[] args) {
		String data1="1234";
		int resData1= Integer.parseInt(data1);
		System.out.println("data1: "+resData1);
		
		String data2="12345.678";
		double resData2= Double.parseDouble(data2);
		System.out.println("data2: "+resData2 );
		
		double data3=12345.678;
		String resData3= String.valueOf(data3);
		System.out.println("data2: "+resData3);
		
		
	}

}
