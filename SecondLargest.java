/* Write a program in C to find the second largest element in an array.
*/
package com.cts;
import java.util.Scanner;
public class SecondLargest {
 
	public static void main(String[] args)
	{
 
		int size;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        size = s.nextInt();
        int a[] = new int[size];
        int largest = a[0];
		int secondLargest = a[0];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < size; i++)
        {
            a[i] = s.nextInt();
        }
		for (int i = 0; i < a.length; i++) {
 
			if (a[i] > largest) {
				secondLargest = largest;
				largest = a[i];
 
			} else if (a[i] > secondLargest) {
				secondLargest = a[i];
 
			}
		}
 
		System.out.println("\nSecond largest number is:" + secondLargest);
 
	}
	}
