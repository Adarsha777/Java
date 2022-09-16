package com.basicJava.class3;

public class AbstractDemoUse extends AbstractDemo {
	public void mul(int num1,int num2) {
		int num=num1*num2;
		System.out.println("the multiplication is= "+num);
	}
	
	public int sub(int num1,int num2) {
		return num1-num2;
	}
	
	public static void main(String[] args) {
		AbstractDemoUse abstractdemouse= new AbstractDemoUse();
		abstractdemouse.mul(10,20);
		System.out.println("substraction is="+abstractdemouse.sub(50, 40));
		abstractdemouse.sum(10,20);
	}
	
}