package com.UsingThread;

import java.util.Stack;

public class Consumer implements Runnable {

	public Stack<String> n = new Stack<String>();

	public Consumer(Stack<String> n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {

		synchronized (n) {
			for (int i = 0; i < 10; i++) {

				while (n.isEmpty()) {

					try {

						n.wait();

					}

					catch (Exception e) {

						e.printStackTrace();
					}

				}
				System.out.println("Consumed" + n.pop().toString());

			}
		}

	}

}
