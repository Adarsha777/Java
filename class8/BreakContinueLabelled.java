package com.basicJava.class8;

public class BreakContinueLabelled {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		firstLoop:
		for(int i=0;i<10;i++)
		{
			secondLoop:
			for(int j=0;j<10;j++)
			{
				thirdLoop:
				for(int k=0;k<10;k++)
				{
					if(k==2)
					{
						break secondLoop;
					}
					System.out.println(i+", "+j+", "+k);
				}
			}
		}
		
	}
}
