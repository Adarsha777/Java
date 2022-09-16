package com.basicJava.class10;

import java.util.Arrays;

public class QArray {
	public static void main(String[] args) {
	
		String[] datas= {"Apple","Ball","Cat","Dog"};
		int[] dataInt=new int[datas.length];
		
		for(int i=0;i<datas.length;i++) {
			String data=datas[i];
			int length=data.length();
			dataInt[i]=length;
			
		}
		System.out.println("Original Array: "+Arrays.toString(datas));
		System.out.println("Int Array:"+Arrays.toString(dataInt));
		
		
	}

}
