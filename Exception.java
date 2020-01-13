package com.cts;

public class Exception {
	

	public static void logic() throws ArithmeticException,NullPointerException,ArrayIndexOutOfBoundsException,NumberFormatException 
	{
		String s =null;
		System.out.println("begin");
		int a=Integer.parseInt(s);
		System.out.println("got the value from user");
		int b=10/(10-a);
		System.out.println("b="+b);
		String name="prudhvi";
		name=null;
		System.out.println("height:"+name.length());
		System.out.println("stop");
	}
	public static void main(String[] args )
	{
		try
		{
			logic();
		}
		catch(NumberFormatException ex)
		{
			System.out.println("check the value");
		}
	}

}
