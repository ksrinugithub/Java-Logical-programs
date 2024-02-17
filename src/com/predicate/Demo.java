package com.predicate;

import java.util.function.Predicate;

import com.lambddaAndfunctionall1.inter;

public class Demo {
	public static void main(String[] args) {
		int[] i = { 0, 5, 10, 15, 20, 25, 30 };
		Predicate<Integer> p = x -> x > 10;
		Predicate<Integer> pp = x -> x % 2 == 0;
		for (int a : i) {
			if (p.and(pp).test(a)) {

				System.out.println(a);

			}

		}

	}
}
