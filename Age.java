/*Write a Program to accept the age of the user and then, display the category of the
   user. Based on the age, the categories of the users are:
	05-12 Children
	13-19 Teenagers
	20-35 Young adults
	36-45 Mature adults
	46-55 Elders
	56 and above Seniors*/
package com.cts;

import java.util.Scanner;

public class Age {

	public static void main(String[] args)
	{
		int age;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the age");
		age=sc.nextInt();
		if(age>=5&&age<=12)
		{
		System.out.println("children");
	    }
		if(age>=13&&age<=19)
		{
		System.out.println("Teenagers");
	    }
		if(age>=20&&age<=35)
		{
		System.out.println("young adult");
	    }
		if(age>=36&&age<=45)
		{
		System.out.println("mature adult");
	    }
		if(age>=46&&age<=55)
		{
		System.out.println("elders");
	    }
		if(age>=56&&age<=90)
		{
		System.out.println("senior citizen");
	    }
		
}
}