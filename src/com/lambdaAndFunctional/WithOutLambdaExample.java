package com.lambdaAndFunctional;

public class WithOutLambdaExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface1 ii = (i, b) -> System.out.println("the sum:" + (i + b));
		ii.add(10, 20);

	}

}
