/*Consider a scenario where all candidates have to take two tests before appearing for an
   interview. A candidate is selected for the interview round, based on the scores of the two
   tests. The individual score in each test should be greater than 75, and the average
   score for the two tests should be a minimum of 80. A call letter for the interview is to
   be sent to candidates who have been selected, and a rejection letter is to be sent to
   the rest.*/

package com.cts;

import java.util.Scanner;

public class Student {

	public static void main(String[] args) {
		int t1,t2,sum;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks of t1:");
		t1=sc.nextInt();
		System.out.println("enter the marks of t2:");
		t2=sc.nextInt();
		sum=(t1+t2)/2;
		if(t1>=75&&t2>=75&&sum>=80)
		{
			System.out.println("you have an interview now");
		}
		else
		{
			System.out.println("you have not eligible to attend the interview");
		}
	}
}
