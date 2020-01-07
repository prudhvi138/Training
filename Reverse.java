/*Write a program in Java to read n number of values in an array and display it in reverse order
Test Data : 
Input the number of elements to store in the array :3 
Input 3 number of elements in the array : 
element - 0 : 2 
element - 1 : 5 
element - 2 : 7
Expected Output : 
The values store into the array are : 
2 5 7 
The values store into the array in reverse are : 
7 5 2 */


package com.cts;

import java.util.Scanner;

public class Reverse
{
   public static void main(String args[])
   {
       int size, i, j, temp;
       int arr[] = new int[50];
       Scanner scan = new Scanner(System.in);
	   
       System.out.print("Enter Array Size : ");
       size = scan.nextInt();
	   
       System.out.print("Enter Array Elements : ");
       for(i=0; i<size; i++)
       {
           arr[i] = scan.nextInt();
       }
	   
       j = i - 1;     
       i = 0;       
	   
       while(i<j)
       {
           temp = arr[i];
           arr[i] = arr[j];
           arr[j] = temp;
           i++;
           j--;
       }
	   
       System.out.print("Now the Reverse of Array is : \n");
       for(i=0; i<size; i++)
       {
           System.out.print(arr[i]+ "  ");
       }       
   }
}