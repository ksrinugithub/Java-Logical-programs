package com.function;

import java.util.function.Function;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function<String, Integer> f = a -> a.length();
		System.out.println(f.apply("srinu is a very good boy"));
		
		Function<String, String> ff = a -> a.toUpperCase();
		System.out.println(ff.apply("srinu is a very good boy"));

		Function<String, String> fff = a -> a.concat("yadav");
		System.out.println(fff.apply("srinu is a very good boy"));
	}

}
