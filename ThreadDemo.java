package com.cts;

public class ThreadDemo {

	public static void main(String[] args) {
		Thread thread=Thread.currentThread();
		System.out.println(thread);
		System.out.println("Thread name:"+thread.getName());
		thread.setName("CTS Thread");
		System.out.println("Thread name:"+thread.getName());
		System.out.println("Is thread is daemon ?"+thread.isDaemon());
		System.out.println("thread is alive?"+thread.isAlive());

	}

}
