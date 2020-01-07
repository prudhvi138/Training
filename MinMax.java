package com.cts;

import java.util.Scanner;

public class MinMax
{
	public static void main(String[] args) 
	{
		 int size;
         Scanner s = new Scanner(System.in);
         System.out.print("Enter the number of elements in array:");
         size = s.nextInt();
         int a[] = new int[size];
         System.out.println("Enter all the elements:");
         for(int i = 0; i < size; i++)
         {
             a[i] = s.nextInt();
         }

		int min = a[0]; 
		int max = a[0]; 

		for (int i = 1; i < a.length; i++)  
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
			if (a[i] < min) 
			{
				min = a[i];
			}
		}

		System.out.println("Largest Number is: " + max);
		System.out.println("Smallest Number is: " + min);
	}
}
