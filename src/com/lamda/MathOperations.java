package com.lamda;

interface IMathFunction {
	int calculate(int a, int b);
}

public class MathOperations {

	public static void main(String[] args) {
		IMathFunction add=Integer::sum;
		IMathFunction multiply=(x,y) -> x*y;
		IMathFunction divide=(int x,int y) -> x/y;
		System.out.println("Addition is"+add.calculate(6, 3));
		System.out.println("Multiplication is"+multiply.calculate(6 , 3));
		System.out.println("Addition is"+add.calculate(6, 3));
	}
}
