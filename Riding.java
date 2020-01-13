package com.cts;

public class Riding {

	public static void main(String[] args) {
		Employee1 emp=new Manager1();
		emp.display();
		
	}

}
class Employee1
{
	void display()
	{
		System.out.println("employee class");
	}
}
class Manager1 extends Employee1
{
	void display()
	{
		System.out.println("manager class");
	}
}