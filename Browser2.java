package com.technoelevate.multithread.programs;

public class Browser2 implements Runnable {

	@Override
	public void run() {
		for(int i =0;i<=5;i++) {
			System.out.println("This is the Browser2 Thread "+i+" The end of the Thread ");
		}
	}
}
