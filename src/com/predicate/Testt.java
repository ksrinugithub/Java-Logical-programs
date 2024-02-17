package com.predicate;

import java.util.function.Predicate;

public class Testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p=a-> a%2==0;
		System.out.println(p.test(10));

	}

}
