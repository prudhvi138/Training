/*Write a Program that accepts the length and breadth of a
   rectangle and displays its area and perimeter.*/


package com.cts;
import java.util.Scanner;
public class Rectangle {

	public static void main(String[] args) {
		 float length,breadth,perimeter,area;
		 Scanner sc = new Scanner(System.in);
	      System.out.println("Enter length of rectangle");
	      length= sc.nextFloat();
	      System.out.println("Enter breadth of rectangle");
	      breadth=sc.nextFloat();
	      
	      perimeter=2*(length+breadth);
	      area=length*breadth;
	      System.out.println("the perimeter of rectangle:"+perimeter);
	      System.out.println("the area of rectangle:"+area);
	}

}
