package com.LambdadAndMultithreading;

public class LambdaForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = () -> {
			for (int i = 0; i < 4; i++) {
				System.out.println("hi this is child thread");

			}
		};

		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 6; i++) {
			System.out.println("this is the main thread");

		}

	}

}
