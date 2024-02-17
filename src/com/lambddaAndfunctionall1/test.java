package com.lambddaAndfunctionall1;

public class test implements inter {

	@Override
	public void squareit(int n) {
		// TODO Auto-generated method stub
		System.out.println("the squareit of:"+(n*n));
		
		
	}
	public static void main(String[] args) {
		test  t=new test();
		t.squareit(10);
	}

}
