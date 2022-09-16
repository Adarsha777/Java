package com.basicJava.class12;

import java.util.Arrays;

public class PassByReference {
	
public void showData(int[] data1) {
		
		data1[0] = 100;
		data1[1] = 123;
		
	}

	
	public static void main(String[] args) {
		
		
		int[] data = {1,2,3,4,5};
		PassByReference demo = new PassByReference();
		System.out.println("Before method call :"+Arrays.toString(data));
		demo.showData(data);
		System.out.println("After method call :"+Arrays.toString(data));
		
		
	}
	
}