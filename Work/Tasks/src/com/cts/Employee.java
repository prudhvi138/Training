package com.cts;

import java.util.Comparator;
import java.lang.String;

public class Employee {
	public Employee(int id, String name, String address, int age, double phone, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.age = age;
		this.phone = phone;
		this.salary = salary;
	}
	private int id;
	private String name;
	private String address;
	private int age;
	private double phone;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPhone() {
		return phone;
	}
	public void setPhone(double phone) {
		this.phone = phone;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String toString()
	{
		return id+":"+name+":"+address+":"+age+";"+phone+":"+salary;
	}
	
	

	/*public int compareTo(Employee employee) {
		if(this.id>employee.id)
		{
		return 1;
	}
	else if(this.id==employee.id)
	{
		return 0;
	}
	else
	{
		return -1;
	}
 
	
	}*/
}
class SortById implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getId()>o2.getId())
		{
		return 1;
	}
	else if(o1.getId()==o2.getId())
	{
		return 0;
	}
	else
	{
		return -1;
	}
		
	}
}
/*class SortByName implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		if((o1.getName())compareTo(o2.getName()))
		{
		return 1;
	}
	else if(o1.getId()==o2.getId())
	{
		return 0;
	}
	else
	{
		return -1;
	}
		
	}
		
	}
	
}*/
