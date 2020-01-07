package com.cts;

import java.util.Scanner;

public class CopyArray
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
        int b[] = new int[a.length]; 
        b = a;     
        System.out.println("elements of a[] "); 
        for (int i=0; i<a.length; i++) 
            System.out.print(a[i] + " "); 
  
        System.out.println("elements of b[] "); 
        for (int i=0; i<b.length; i++) 
           System.out.print(b[i] + " "); 
    } 
} 

