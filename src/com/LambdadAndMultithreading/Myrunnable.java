package com.LambdadAndMultithreading;

public class Myrunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 5; i++) {
			System.out.println("child thread---1");

		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myrunnable m = new Myrunnable();
		Thread t = new Thread(m);
		t.start();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("main thread ----1");

		}

	}

}
