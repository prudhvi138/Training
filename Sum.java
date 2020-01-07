/*Write a program in C to find the sum of all elements of the array.
*/

package com.cts;

import java.util.Scanner;
public class Sum
{
    public static void main(String[] args) 
    {
        int size, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements in array:");
        size = s.nextInt();
        int arr[] = new int[size];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < size; i++)
        {
            arr[i] = s.nextInt();
            sum = sum + arr[i];
        }
        System.out.println("Sum is :"+sum);
    }
}