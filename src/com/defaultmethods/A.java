package com.defaultmethods;

public interface A {
	public void m1();

	public void m2();

	public void m3();

	default void m4() {
		System.out.println("this is the m4 ");
	}

}
