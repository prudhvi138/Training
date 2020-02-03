package com.cts;
import java.util.Scanner;
class Req{
	public static void main(String args[])
	{
		int num;
		Studentd stu=new Studentd();
		Employeed emp=new Employeed();
		System.out.println("enter 1.student 2.employee");
		Scanner s = new Scanner(System.in);
		num=Integer.parseInt(s.nextLine());
		switch(num)
		{
		case 1:stu.getData();
		stu.display();
		break;
		case 2:emp.getData();
		emp.display();
		
		break;
		
		
		}
		
	}
}
class Studentd {
	String fname,sname,course;
	int stuid,age;
	public void getData()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter student Id");
		stuid = Integer.parseInt(s.nextLine());
		System.out.println("Enter student age");
		age = Integer.parseInt(s.nextLine());
		System.out.println("Enter Student first Name");
		fname = s.nextLine();
		System.out.println("Enter student second name");
		sname = s.nextLine();
		System.out.println("Enter course enrolled");
		course = s.nextLine();
	}
	public void display() {
		System.out.println(stuid + ":" + age + ":" + fname + ":"+ sname + ":"+ course);
}
}
class Employeed extends Studentd
{
	String fname,sname,dept,desg;
	int empid,age,salary;
	public void getData()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter employee empId");
		empid = Integer.parseInt(s.nextLine());
		System.out.println("Enter employee age");
		age = Integer.parseInt(s.nextLine());
		System.out.println("Enter employee salary");
		salary = Integer.parseInt(s.nextLine());
		System.out.println("Enter employee first Name");
		fname = s.nextLine();
		System.out.println("Enter employee second name");
		sname = s.nextLine();
		System.out.println("Enter employee department");
		dept= s.nextLine();
		System.out.println("Enter employee designation");
		desg= s.nextLine();
	}
	public void display() {
		System.out.println(empid + ":" + age + ":" + salary + ":"+ fname + ":"+sname + ":"+dept + ":"+desg);
}
}


