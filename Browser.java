package com.technoelevate.multithread.programs;

public class Browser  extends Thread{

	@Override
	public void run() {
		for(int i =0; i<=5;i++) {
			System.out.println("This is the Browser FirstThread "+i+" The End of the Thread");
		}
	}
	
	
	

}
