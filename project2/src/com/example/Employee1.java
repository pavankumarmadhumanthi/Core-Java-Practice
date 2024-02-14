package com.example;

import java.time.LocalDate;

public class Employee1 {
	private int id;
	private String name;
	private double salary;
	private String department;
	private String jobTitle;
	private LocalDate doj;
	public Employee1(int id, String name, double salary, String department, String jobTitle, LocalDate doj) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;
		this.jobTitle = jobTitle;
		this.doj = doj;
	}
	
	
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


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}


	public String getJobTitle() {
		return jobTitle;
	}


	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}


	public LocalDate getDoj() {
		return doj;
	}


	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}


	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department
				+ ", jobTitle=" + jobTitle + "]";
	}
	
	

}
