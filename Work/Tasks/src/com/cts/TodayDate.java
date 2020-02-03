package com.cts;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class TodayDate {

	public static void main(String[] args) {
		
//		LocalDate date=LocalDate.now();
//		System.out.println("today's date is :"+date);
//				LocalDate date=LocalDate.now();
//				int day=date.getDayOfMonth();
//				int month=date.getMonthValue();
//				int year=date.getYear();
//				System.out.printf("Year : %d , Month : %d , Day : %d \t %n",year,month,day);
//				LocalDate birthday=LocalDate.of(1997, 5, 11);
//				System.out.println("Your birthday is :"+birthday);
//				LocalDate today=LocalDate.now();
//				LocalDate birthday=LocalDate.of(1997, 05, 11);
//				if(birthday.equals(today))
//				{
//					System.out.printf("Today %s and birthday %s are same dates %n",today,birthday);
//				}
//				else
//				{
//					System.out.println("Dates are not Equal");
//				}
//				LocalTime current=LocalTime.now();
//				System.out.println("Current time is :"+current);
//				Clock clock=Clock.systemUTC();
//				System.out.println("Clock :"+clock);
//				Clock defaultClock=Clock.systemDefaultZone();
//				System.out.println("Clock :"+defaultClock);
//				LocalDate today=LocalDate.now();
//		
//				LocalDate tommorow=LocalDate.of(2020, 1, 15);
//				if(today.isBefore(tommorow))
//				{
//					System.out.println("TRUE");
//				}
//				if(today.isAfter(tommorow))
//				{
//				System.out.println("TRUE");
//				}
				LocalDate arrival=LocalDate.now();
//				try
//				{
//					DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
//					String comming=arrival.format(formatter);
//					System.out.printf("The Date %s is formatted in %s %n",arrival,comming);
//				}
//				catch (Exception e) {
//					e.printStackTrace();
//				}
				//}
				String birthday="Nov 05 1997";
				try
				{
					DateTimeFormatter formatter=DateTimeFormatter.ofPattern("MMM dd yyyy");
					LocalDate birth=LocalDate.parse(birthday, formatter);
					System.out.printf("The Date %s is formatted in %s %n",birthday,birth);
				}
				catch (Exception e) {
					e.printStackTrace();
				}
				}
				}
				
																																																																																																																																																																									

		

