package com.lambddaAndfunctionall;

public class Test implements InterFF {

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("the sum of:" + (a + b));
		System.out.println("the multification of:" + (a * b));
	}

	public static void main(String[] args) {
		Test t = new Test();
		t.add(10, 20);
		t.add(100, 200);
	}
}
