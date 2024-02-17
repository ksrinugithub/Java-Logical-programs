package com.lambda;

public class CalculationTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculation addition = (a, b) -> a + b;
		System.out.println("calculating valuess:"+addition.calculate(10, 15));
		Calculation subtraction=(a,b)->a-b;
		System.out.println("Calculating valuess:"+subtraction.calculate(25, 20));

	}

}
