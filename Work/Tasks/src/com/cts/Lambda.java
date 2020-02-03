package com.cts;

public class Lambda {

	public static void main(String[] args) {
	Hello h =() -> {
	System.out.println("this is lambda expression");
	System.out.println("this is lambda expression");
	System.out.println("this is lambda expression");
	System.out.println("this is lambda expression");
	};
	h.display();
}
}
interface Hello
{
	public void display();
}
