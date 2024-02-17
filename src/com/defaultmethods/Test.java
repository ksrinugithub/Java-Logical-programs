package com.defaultmethods;

public class Test implements A {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("m1 method");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("m2 method");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Test t = new Test();
		t.m1();
		t.m2();
		t.m3();
		t.m4();
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		System.out.println("m3 method");
		
	}

}
