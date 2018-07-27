package com.UsingThread;

import java.util.Random;
import java.util.Stack;

public class Producer implements Runnable {

	public Stack<String> n = new Stack<String>();

	public Producer(Stack<String> n) {
		super();
		this.n = n;
	}

	@Override
	public void run() {

		for (int j = 0; j < 10; j++) {
			StringBuilder sb = new StringBuilder();
			String candidateChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
			int length = 17;
			Random random = new Random();
			synchronized (n) {
				for (int i = 0; i < length; i++) {

					sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));

				}

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				n.push(sb.toString());
				System.out.println("Produced: " + sb.toString());
				if (n.size() > 0) {
					n.notify();
				}
			}

		}

	}

}
