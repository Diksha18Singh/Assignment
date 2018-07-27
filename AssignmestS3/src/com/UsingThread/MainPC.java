package com.UsingThread;

import java.util.Stack;

public class MainPC {

	public static Stack<String> n = new Stack<String>();

	public static void main(String[] args) throws InterruptedException {

		Producer p = new Producer(n);
		Consumer c = new Consumer(n);

		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);

		t1.start();

		t2.start();

		// Thread.sleep(10);

		// try
		// {
		//
		// }catch(Exception ex)
		// {
		// ex.printStackTrace();
		// }
		//
		// }

	}
}
