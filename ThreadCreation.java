package com.cts;

public class ThreadCreation {

	public static void main(String[] args) {
	System.out.println("Main Thread");
	FirstThread firstthread=new FirstThread();
	SecondThread secondthread=new SecondThread();
	firstthread.start();//it will call run
	secondthread.start();
	/*for(int i=1;i<=5;i++)
	{
		System.out.println("Main Thread :"+i);
		try
		{
		Thread.sleep(2000);
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	}*/
	}
}
class FirstThread extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("First Thread :"+i);
			try
			{
			Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
	}
}
}
	class SecondThread extends Thread
	{
		Resource resource;
		public SecondThread() {
			this.resource=resource;
		}
public void run()
{
	resource.display("second Thread");
}
}


class Resource
{
	public void display(String message)
	{
		synchronized (this) {
			for(int i=1;i<=5;i++)
			{
				System.out.println(message+""+i);
				try
				{
				Thread.sleep(2000);}
				catch(InterruptedException e)
				{
					e.printStackTrace();
				}
			}
			
		}
		
	}
}