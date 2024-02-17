package com.lambdaAndFunctional;

import com.lambddaAndfunctional.interF;

public class Withlambda implements Interface1 {

	@Override
	public void add(int i, int b) {
		// TODO Auto-generated method stub
		System.out.println("the Sum:"+ (i + b));

	}

	public static void main(String[] args) {
		Interface1 ii = new Withlambda();
		ii.add(10, 200);
	}

}
