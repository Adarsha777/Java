package com.basicJava.class10;
public class BestArrayDemo {
	public static void main(String[] args) {
		
		int[] a = {2,10,9,3};
		int result =isBest(a);
	System.out.println("Result is:"+result);
	}
private static int isBest(int[] a) {
for(int i=0;i<a.length;i++) {
	
	int num =a[i];
	int eleMin =num-1;
	int elePlus = num+1;
	int flagCheck=0;
	
	for(int j=0;j<a.length;j++) {
		if(a[j]==eleMin || a[j]==elePlus) {
		 flagCheck = 1;

		}
	}
	if(flagCheck==0) {
		return 0;
	}
}
	return 1;
}
}