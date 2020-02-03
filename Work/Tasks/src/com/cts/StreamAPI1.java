package com.cts;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI1 {

	public static void main(String[] args) {
		List<Employee> employees=new ArrayList<Employee>();
		addEmployees(employees);
		//employees.forEach(System.out::println);
		//List<Employee>ageScale=employees.stream().filter(emp->emp.getAge() < 22).collect(Collectors.toList());
		//List<Employee>nameLength=employees.stream().filter(emp->emp.getName().length() < 5).collect(Collectors.toList());
		//System.out.println("THE names with less than length five:\n ");
		//nameLength.forEach(System.out::println);
		List<Employee>Salary=employees.stream().map(emp->{emp.setSalary(emp.getSalary()*1.1);return emp;}).collect(Collectors.toList());
		System.out.println("The Salary increase by 10%:\n ");
		Salary.forEach(System.out::println);
	}

	private static void addEmployees(List<Employee> employees) {
		Employee emp1=new Employee(122,"raj","delhi",22,749348349483L,23131.00);
		Employee emp2=new Employee(123,"venkat","punae",24,980948404L,531312.00);
		Employee emp3=new Employee(124,"ram","vijayawada",21,90608500390L,453131.00);
		Employee emp4=new Employee(125,"prasanth","hyderabad",26,8098985905L,6123131.00);
		Employee emp5=new Employee(126,"vimal","mumbai",20,9894894039L,53131.00);
		employees.add(emp1);
		employees.add(emp2);
		employees.add(emp3);
		employees.add(emp4);
		employees.add(emp5);
		
		
	}

}
