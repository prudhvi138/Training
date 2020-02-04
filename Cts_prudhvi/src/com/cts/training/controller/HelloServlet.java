package com.cts.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Enumeration;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/helloServlet")
public class HelloServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		String id=request.getParameter("id");
		String fullname =request.getParameter("fullname");
		Long phone  =Long.parseLong(request.getParameter("phone"));
		String email = request.getParameter("email");
		out.println("Id :"+id);
		out.println("Fullname :"+fullname);
		out.println("Phone :"+phone);
		out.println("Email :"+email);
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/cts_employees";
			String username="root";
			String password="admin";
			Connection conn=  DriverManager.getConnection(url, username, password);
			System.out.println("Connection Succesfull");
			String query="insert into Details values (?,?,?,?)";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setString(1, id);
			ps.setString(2, fullname);
			ps.setLong(3, phone);
			ps.setString(4, email);
			int result=ps.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
