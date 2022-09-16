package com.basicJava.class6;

import java.util.Scanner;

public class SwitchCaseDayDiscountDemo {
		public static void main(String[] args) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter an integer:");
			int a =scanner.nextInt();
			System.out.println("Shoping amount");
			int T=scanner.nextInt();
			int D=0;
			
			switch(a) {
			
			case 1:
				System.out.println("Sunday");
				D=(int)(T-(T*0.05));
				break;
				
			case 2:
				System.out.println("Monday");
				D=(int)(T-(T*0.07));
				break;
				
			case 3:
				System.out.println("Tuesday");
				D=(int)(T-(T*0.09));
				break;
			case 4:
				System.out.println("Wednesday"); 
				D=(int)(T-(T*0.04));
				break;
				
			case 5:
				System.out.println("Thurseday");
				D=(int)(T-(T*0.02));
				break;
				
			case 6:
				System.out.println("Friday");
				D=(int)(T-(T*0.07));
				break;
				
			case 7:
				System.out.println("Saturday");
				D=(int)(T-(T*0.15));
				break;
			}
			System.out.println("The final amount is: "+D);
			scanner.close();
			
			
			
			
		}
}
