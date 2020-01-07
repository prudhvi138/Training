/* Write a Program that accepts a number and checks whether it's positive, negative, or
   zero.*/
package com.cts;

import java.util.Scanner;

public class Number {
   public static void main(String args[]){
      int num;
      System.out.println("Enter a number ::");
      Scanner sc = new Scanner(System.in);
      num = sc.nextInt();

      if (num > 0){
         System.out.println("Given number is a positive integer");
      }
      else if(num < 0){
         System.out.println("Given number is a negative integer");
      }
      else {
         System.out.println("Given number is zero");
      }
   }
}
