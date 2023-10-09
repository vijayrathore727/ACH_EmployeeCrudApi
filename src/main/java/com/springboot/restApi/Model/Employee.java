package com.springboot.restApi.Model;

public class Employee {

	
	private String empName;
	private int salary;
	private int age;
	private String empCity;
	private int empID;
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmpCity() {
		return empCity;
	}
	public void setEmpCity(String empCity) {
		this.empCity = empCity;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + ", age=" + age + ", empCity=" + empCity
				+ ", empID=" + empID + "]";
	}
	public Employee(String empName, int salary, int age, String empCity, int empID) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.age = age;
		this.empCity = empCity;
		this.empID = empID;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
}
