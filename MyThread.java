package com.technoelevate.multithread.programs;

public class MyThread  {
	
	public static void main(String[] args) {
		System.out.println("This is the Main Thread");
		Browser b1= new Browser();
		b1.start();
		System.out.println("--------Break between two Threads---------");
		Browser2 b2= new Browser2();
		Thread browser2=new Thread(b2);
		browser2.start();
		new Thread(){
			public void run(){
			System.out.println("This is the Third Thread ");
			
			}
		}.start();
		
	}
	

}
