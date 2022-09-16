package com.basicJava.class11;

public class addTwoMatrices {
	public static void main(String[] args) {
		int[][] array1= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] array2= {{4,2,8},{6,3,7},{1,9,5}};
		int[][] array3=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			 array3[i][j] =array1[i][j]+array2[i][j];
			}
		}
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(array3[i][j] + " ");
			}
			System.out.println("");
		}
	}

}
