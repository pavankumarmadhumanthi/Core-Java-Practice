package com.javaEncapsulation;

public class Employee {
	private int empId;
	private String empName;
	private int empSalary;
	public Employee() {
		
	}
	
	public Employee(int empId,String empName,int empSalary) {
		this.empId=empId;
		this.empName=empName;
		this.empSalary=empSalary;
	}
	
	public void setEmpId(int empId) {
		this.empId=empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}
	
	public String toString() {
		return "empId --->"+empId+" "+"empName--->"+empName+" "+"empSalary--->"+empSalary;
		
	}
	
	
	
	

}
