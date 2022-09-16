package com.basicJava.class2;

public class dataTypeDemo {
	public static void main(String[] args) {
		int num1=2;
		long num2=23L;
		double num3=3.45;
		float num4=5.67f;
		char data1='a';
		String data2="Texas International College";
		boolean flag=true;
		byte data3=4;
		int[] dataArray= {1,2,3,4};
		String[] dataString= {"Adarsha","Chaulagain","Ram"};
		char[] dataChar= {'a','b','c'};
		
		System.out.println("Data Type of Num 1 is int :"+num1);
		System.out.println("Data Type of Num 2 is long: "+num2);
		System.out.println("Data Type of Num 3 is double: "+num3);
		System.out.println("Data Type of Num 4 is float: "+num4);
		System.out.println("Data Type of Data1 is char: "+data1);
		System.out.println("Data Type of Data2 is string: "+data2);
		System.out.println("Data Type of flag is boolean: "+flag);
		System.out.println("Data Type of Data3 is byte: "+data3);
		
		//System.out.println("Data Type of dataArray is int: "+dataArray);
		//System.out.println("Data Type of dataString is string: "+dataString);
		//System.out.println("Data Type of dataChar is char: "+dataChar);
		
		for(int i=0;i<dataArray.length;i++) 
			{
				int data= dataArray[i];
				System.out.println("Data of int array:["+i+"] "+data);
			}
		
		for(int i=0;i<dataString.length;i++)
		{
			String dataS= dataString[i];
			System.out.println("Data of string array:["+i+"] "+dataS);
		}
		
		for(int i=0;i<dataChar.length;i++)
		{
			char dataC= dataChar[i];
			System.out.println("Data of char array:["+i+"] "+dataC);
		}
		
		
		
	}

}
