package com.cts;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo {

	public static void main(String[] args) {
	ArrayList<Employee> list=new ArrayList<Employee>();
	Employee emp1=new Employee(100,"prudhvi","hyderabad",22,909891009L,7687887.00);
	Employee emp2=new Employee(101,"raju","vijayawada",21,909891009L,7687887.00);
	Employee emp3=new Employee(106,"venkat","ongole",19,909891009L,7687887.00);
	Employee emp4=new Employee(103,"suresh","vizag",27,909891009L,7687887.00);
	Employee emp5=new Employee(99,"mahesh","chennai",24,909891009L,7687887.00);
	list.add(emp1);
	list.add(emp2);
	list.add(emp3);
	list.add(emp4);
	list.add(emp5);
	SortById sb=new SortById();
	Collections.sort(list,sb);
	for(Employee employee:list)
	{
	System.out.println(employee);
	}
 
	}

}
