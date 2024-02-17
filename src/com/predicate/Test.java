package com.predicate;

import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] a = { 10, 25, 55, 88, 77, 79,9 };
		Predicate<Integer> p = a1 -> a.length % 2 == 1;

		for (Integer a1 : a) {
			if (p.test(a1)) {
				System.out.println(a1);
			}

		}

	}

}
