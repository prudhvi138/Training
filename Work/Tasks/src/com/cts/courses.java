package com.cts;

import java.util.Scanner;

public class courses {

	public static void main(String[] args) {
		String courses[]= {"java","c","c++","python","angular"};
		Scanner sc = new Scanner(System.in);
		int len=courses.length;
		String choice;
		System.out.println("\tcourese");
		System.out.println("1.java\t\t 5000\n");
		System.out.println("2.c\t\t 3000\n");
		System.out.println("3.c++\t\t 2000\n");
		System.out.println("4.python\t10000\n");
		System.out.println("5.angular\t20000\n");
		System.out.println("which course do you want take");
		choice=sc.nextLine();
		int price=0;
		if(choice.contains("java"))
		{
			price=price+5000;
		}
		if(choice.contains("c"))
		{
			price=price+3000;
		}
		if(choice.contains("c++"))
		{
			price=price+2000;
		}
		if(choice.contains("python"))
		{
			price=price+10000;
		}
		if(choice.contains("angular"))
		{
			price=price+20000;
		}
		
		System.out.println("the total price : " + price + " for "+ choice);
	}
	

}
