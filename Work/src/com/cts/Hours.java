/*Write a Program to accept hours and number of resources and display the total
   number of productive hours. (Total number of productive hours = hours * number of
   resources).*/
package com.cts;

import java.util.Scanner;

public class Hours {

	public static void main(String[] args) {
		int hrs,res,phrs;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the hours");
		hrs=sc.nextInt();
		System.out.println("enter the resources:");
		res=sc.nextInt();
        if(hrs>1)
		{
			phrs=hrs*res;
			System.out.println("The productive hours:"+phrs);
		}
        else
        {
        	System.out.println("The time should be in hrs");
        }
		
	}

}
