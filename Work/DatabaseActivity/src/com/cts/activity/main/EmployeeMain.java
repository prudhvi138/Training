package com.cts.activity.main;
import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class EmployeeMain {

	public static void main(String[] args)throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/cts_employees";
				String username="root";
				String password="admin";
				Connection conn=DriverManager.getConnection(url, username, password);
				System.out.println("connection established");
				Statement stmt= conn.createStatement();
				Scanner sc=new Scanner(System.in);
				System.out.println("enter empid");
				int empid=Integer.parseInt(sc.nextLine());
				System.out.println("enter name");
				String fname=sc.nextLine();
				System.out.println("enter age");
				int age=Integer.parseInt(sc.nextLine());
				System.out.println("enter phone");
				Long phone= Long.parseLong(sc.nextLine());
				System.out.println("enter dept");
				String dept=sc.nextLine();
				System.out.println("enter location");
				String location=sc.nextLine();
				System.out.println("enter salary");
				int salary=Integer.parseInt(sc.nextLine());
				String query="insert into employee values(?,?,?,?,?,?,?)";
				PreparedStatement ps=conn.prepareStatement(query);
				ps.setInt(1, empid);
				ps.setString(2, fname);
				ps.setInt(3, age);
				ps.setLong(4, phone);
				ps.setString(5, dept);
				ps.setString(6, location);
				ps.setInt(7, salary);
				int result=ps.executeUpdate();
				if(result>0)
				{
					System.out.println("data inserted successfully");
				}
				else
				{
					System.out.println("Try again");
				}
				String query1="select * from employee";
				ResultSet rs=stmt.executeQuery(query1);
				while(rs.next())
				{
					System.out.println(rs.getInt("empid")+":"+rs.getString("fname")+":"+rs.getInt("age")+":"+rs.getLong("phone")+":"+rs.getString("dept")+":"+rs.getString("location")+":"+rs.getInt("salary"));
			}
				
				
				}
			}
