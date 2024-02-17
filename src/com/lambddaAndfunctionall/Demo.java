package com.lambddaAndfunctionall;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterFF i = (a, b) -> System.out.println("the sum of:" + (a + b));
		InterFF ii = (a, b) -> System.out.println("the multification of :" + (a * b));
		i.add(10, 20);
		ii.add(100, 200);

	}
}
